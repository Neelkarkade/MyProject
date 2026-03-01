package com.microservice.post.controller;

import com.microservice.post.entity.Post;
import com.microservice.post.payload.PostDto;
import com.microservice.post.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    // ✅ Constructor Injection (CORRECT)
    public PostController(PostService postService) {
        this.postService = postService;
    }

    // POST http://localhost:8081/api/posts
    @PostMapping(consumes = "application/json")
    public ResponseEntity<Post> savePost(@RequestBody Post post) {
        Post newPost = postService.savePost(post);
        return ResponseEntity.status(HttpStatus.CREATED).body(newPost);
    }

    // GET http://localhost:8081/api/posts/{postId}
    @GetMapping("/{postId}")
    public ResponseEntity<Post> getPostByPostId(@PathVariable String postId) {
        Post post = postService.findPostById(postId);
        return ResponseEntity.ok(post);
    }

    // GET http://localhost:8081/api/posts/{postId}/comments
    @GetMapping("/{postId}/comments")
    public ResponseEntity<PostDto> getPostWithComments(@PathVariable String postId) {
        PostDto postDto = postService.getPostWithComments(postId);
        return ResponseEntity.ok(postDto);
    }
}
