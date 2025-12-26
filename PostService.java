package com.microservice.post.service;

import com.microservice.post.entity.Post;
import com.microservice.post.payload.PostDto;
import com.microservice.post.repository.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final RestTemplate restTemplate;

    // ✅ Constructor Injection
    public PostService(PostRepository postRepository, RestTemplate restTemplate) {
        this.postRepository = postRepository;
        this.restTemplate = restTemplate;
    }

    public Post savePost(Post post) {
        post.setId(UUID.randomUUID().toString());
        return postRepository.save(post);
    }

    public Post findPostById(String postId) {
        return postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post not found with id: " + postId));
    }

    public PostDto getPostWithComments(String postId) {

        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post not found with id: " + postId));

        // ✅ FIXED & SAFE
        List comments = restTemplate.getForObject(
                "http://COMMENT-SERVICE/api/comments/" + postId,
                List.class
        );

        PostDto postDto = new PostDto();
        postDto.setPostId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setDescription(post.getDescription());
        postDto.setContent(post.getContent());
        postDto.setComments(comments != null ? comments : List.of());

        return postDto;
    }
}
