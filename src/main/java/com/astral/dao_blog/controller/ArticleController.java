package com.astral.dao_blog.controller;

import com.astral.dao_blog.entity.article;
import com.astral.dao_blog.entity.comment;
import com.astral.dao_blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @RequestMapping("show")
    public List<article> show(){
        return articleService.show();
    }
    @RequestMapping("comment")
    public List<comment> comments(){
        return articleService.comments();
    }
}
