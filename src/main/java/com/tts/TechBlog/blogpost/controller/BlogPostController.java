package com.tts.TechBlog.blogpost.controller;

import com.tts.TechBlog.blogpost.model.BlogPost;
import com.tts.TechBlog.blogpost.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogPostController {

    @Autowired
    private BlogPostService service;

    @GetMapping("/")
    public String index(BlogPost blogPost){
        return "blogpost/index";
    }

    private BlogPost blogPost;

    @PostMapping(value = "/")
    public String addNewBlogPost(BlogPost blogPost, Model model){
        service.addBlogPost(new BlogPost(blogPost.getTitle(), blogPost.getAuthor(), blogPost.getBlogEntry()));
        model.addAttribute("title", blogPost.getTitle());
        model.addAttribute("author", blogPost.getAuthor());
        model.addAttribute("blogEntry", blogPost.getBlogEntry());
        return "blogpost/result";
    }
}
