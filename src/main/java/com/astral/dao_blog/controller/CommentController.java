package com.astral.dao_blog.controller;

import com.astral.dao_blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    @Autowired
    ArticleService articleService;
//    @GetMapping("/api/comment")
//    public List<comment> comments(@RequestParam("url") String url) {
//        return articleService.comments(url);
//    }
}
