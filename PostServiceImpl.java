package com.myblog.myblog11.service.impl;


import com.myblog.myblog11.entity.Post;
import com.myblog.myblog11.exception.ResourceNotFoundException;
import com.myblog.myblog11.payload.PostDto;
import com.myblog.myblog11.repository.PostRepository;
import com.myblog.myblog11.service.PostService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {

        Post post = mapToEntity(postDto);

        Post savedPost = postRepository.save(post);

       PostDto dto = mapToDto(savedPost);
        return dto;
    }

    @Override
    public PostDto getPostById(long id) {
       Post post = postRepository.findById(id).orElseThrow(
               ()-> new ResourceNotFoundException("Post not found with id:"+id)
        );


        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTittle(post.getTittle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        return dto;
    }

    @Override
    public List<PostDto> getAllPosts(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        Page<Post> pagePost = postRepository.findAll(pageable);
        List<Post> posts = pagePost.getContent();
        List<PostDto> dtos = posts.stream().map(p -> mapToDto(p)).collect(Collectors.toList());
        return dtos;
    }
    PostDto mapToDto(Post post){
        PostDto dto = new PostDto();
        dto.setTittle(post.getTittle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        return dto;

    }
    Post mapToEntity(PostDto postDto) {

       // PostDto dto = new PostDto();
       // dto.setTittle(post.getTittle());
       // dto.setDescription(post.getDescription());
       // dto.setContent(post.getContent());
       // return dto;

        Post post = new Post();
        post.setTittle(postDto.getTittle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        return post;
    }
}
