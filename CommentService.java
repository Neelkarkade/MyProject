package com.microservice.comment.service;

import com.microservice.comment.entity.Comment;
import com.microservice.comment.payload.Post;
import com.microservice.comment.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final RestTemplate restTemplate;

    // Use constructor injection only
    @Autowired
    public CommentService(CommentRepository commentRepository, RestTemplate restTemplate) {
        this.commentRepository = commentRepository;
        this.restTemplate = restTemplate;
    }

    public Comment saveComment(Comment comment) {
        try {
            // Call Post service to check if the post exists
            Post post = restTemplate.getForObject(
                    "http://post-service/api/posts/" + comment.getPostId(),
                    Post.class
            );

            if (post == null) {
                throw new RuntimeException("Post with ID " + comment.getPostId() + " not found.");
            }

            // Generate unique ID for the comment
            comment.setCommentId(UUID.randomUUID().toString());

            // Save the comment
            return commentRepository.save(comment);

        } catch (RestClientException e) {
            // Handles Post service unreachable errors
            throw new RuntimeException("Failed to connect to Post service: " + e.getMessage());
        }
    }
    public List<Comment> getAllCommentsByPostId(String postId){
        List<Comment> comments = commentRepository.findByPostId(postId);
        return comments;
    }
}
