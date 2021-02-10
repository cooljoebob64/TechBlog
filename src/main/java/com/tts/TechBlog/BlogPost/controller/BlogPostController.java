package com.tts.TechBlog.BlogPost.controller;

import com.tts.TechBlog.BlogPost.model.BlogPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogPostController {

    @GetMapping("/")
    public String index(BlogPost blogPost){
        return "blogpost/index";
    }
}
