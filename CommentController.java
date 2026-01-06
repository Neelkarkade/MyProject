package com.microservice.comment.controller;

import com.microservice.comment.entity.Comment;
import com.microservice.comment.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    ///http://localhost:8082/api/comments
    @PostMapping
    public ResponseEntity<?> saveComment(@RequestBody Comment comment) {
        try {
            Comment savedComment = commentService.saveComment(comment);
            // Return 201 Created with saved comment
            return new ResponseEntity<>(savedComment, HttpStatus.CREATED);

        } catch (RuntimeException e) {
            // Return 404 Not Found if post does not exist or 500 Internal Server Error if Post service is down
            String errorMessage = e.getMessage();
            if (errorMessage != null && errorMessage.contains("not found")) {
                return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
            }


        }
    }
    @GetMapping("{postId}")
    public List<Comment> getAllCommentsByPostId(@PathVariable String postId){
        List<Comment> comments = commentService.getAllCommentsByPostId(postId);
        return comments;
    }
}
