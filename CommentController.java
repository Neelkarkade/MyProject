package com.example.demo.controller;

import com.example.demo.entity.Comments;
import com.example.demo.entity.Video;
import com.example.demo.repository.CommentsRepository;
import com.example.demo.repository.VideoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comment")
public class CommentController {

    private CommentsRepository commentsRepository;
    private VideoRepository videoRepository;


    public CommentController(CommentsRepository commentsRepository, VideoRepository videoRepository) {
        this.commentsRepository = commentsRepository;
        this.videoRepository = videoRepository;
    }


   @PostMapping
    public ResponseEntity<Comments> createComment(
            @RequestBody Comments comment,
            @RequestParam long videoId
    ){

       Video video = videoRepository.findById(videoId).get();
       
   }

}
