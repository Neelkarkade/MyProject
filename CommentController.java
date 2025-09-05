package com.example.demo.controller;

import com.example.demo.entity.Comments;
import com.example.demo.entity.Video;
import com.example.demo.repository.CommentsRepository;
import com.example.demo.repository.VideoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
            @RequestBody Comments comment
    ){

       commentsRepository.save(comment);
       return  new ResponseEntity<>(comment, HttpStatus.CREATED);
   }

   @GetMapping
    public ResponseEntity<List<Comments>> getAllComments(
            @RequestParam Long videoId
   ){
        Video video = videoRepository.findById(videoId).get();
        List<Comments> comments = commentsRepository.findByVideo(video);
        return  new ResponseEntity<>(comments, HttpStatus.OK);

    }

}
