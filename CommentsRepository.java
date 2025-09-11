package com.example.demo.repository;

import com.example.demo.entity.Comments;
import com.example.demo.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentsRepository extends JpaRepository<Comments, Long> {

    List<Comments> findByVideo(Video video);
}