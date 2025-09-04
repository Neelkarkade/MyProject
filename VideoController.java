package com.example.demo.controller;

import com.example.demo.entity.Video;
import com.example.demo.repository.VideoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    private  VideoRepository videoRepository;


    public VideoController(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @PostMapping
    public ResponseEntity<Video> createVideo(
            @RequestBody Video video
    ){
        videoRepository.save(video);
        return ResponseEntity.ok(video);
    }


}
