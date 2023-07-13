package io.menglibay.springboot.postcoreapi.controller;

import io.menglibay.springboot.postcoreapi.model.PostModel;
import io.menglibay.springboot.postcoreapi.service.PostService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {


    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<String> createPost(@Valid @RequestBody PostModel postModel){
        postService.createPost(postModel);
        return new ResponseEntity<String>("Succesfully Created", HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<PostModel> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/{postId}")
    public PostModel getPostById(@PathVariable String postId){
        return postService.getPostById(postId);
    }

    @PutMapping("/{postId}")
    public ResponseEntity<String> updatePostById(@PathVariable String postId,
                                                 @Valid @RequestBody PostModel postModel){
        postService.updatePostById(postId,postModel);
        return new ResponseEntity<String>("Successfully Updated",HttpStatus.OK);
    }

    @DeleteMapping("/{postId}")
    public ResponseEntity<String> deletePostId(@PathVariable String postId){
        postService.deletePostById(postId);
        return new ResponseEntity<String>("Deleted",HttpStatus.OK);
    }
}
