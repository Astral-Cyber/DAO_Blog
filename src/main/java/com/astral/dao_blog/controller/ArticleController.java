package com.astral.dao_blog.controller;

import com.astral.dao_blog.entity.article;
import com.astral.dao_blog.entity.comment;
import com.astral.dao_blog.service.ArticleService;
import com.astral.dao_blog.util.articleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/api/show")
    public List<article> show() {
        return articleService.show();
    }

    @GetMapping("/api/comment")
    public List<comment> comments(@RequestParam("url") String url) {
        return articleService.comments(url);
    }

    @PostMapping("/admin/submit")
    public String editor(@RequestBody articleInfo articleInfo){
        return articleService.submit(articleInfo);
    }

    @DeleteMapping("/admin/delete")
    public String delete(@RequestParam("id") int id) {
        return articleService.delete(id);
    }
}
