package com.myblog.myblog11.controller;

import com.myblog.myblog11.payload.PostDto;
import com.myblog.myblog11.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public ResponseEntity<PostDto>createPost(@RequestBody PostDto postDto){
        PostDto dto = postService.createPost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    //http://localhost:8080/api/posts/particular?id=1
@GetMapping("/particular")
    public ResponseEntity<PostDto> getPostById(@RequestParam long id){
    PostDto dto = postService.getPostById(id);
   return new ResponseEntity<>(dto,HttpStatus.OK);
}

//http://localhost:8080/api/posts?pageNo=0&pageSize=5
@GetMapping
public List<PostDto> getAllPost(
        @RequestParam(name = "pageNo", required = false, defaultValue = "0") int pageNo,
        @RequestParam(name = "pageSize", required = false, defaultValue = "3") int pageSize
){
  List<PostDto> postDtos =  postService.getAllPosts(pageNo,pageSize);
return postDtos;
}
}
