package com.astral.dao_blog.controller;

import com.astral.dao_blog.entity.article;
import com.astral.dao_blog.entity.comment;
import com.astral.dao_blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//跨域
@CrossOrigin
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/api/show")
    public List<article> show() {
        return articleService.show();
    }

    @GetMapping("/api/getOne")
    public article getOne(@RequestParam("id") int id) {
        return articleService.getOne(id);
    }

    @GetMapping("/api/comment")
    public List<comment> comments(@RequestParam("id") int id) {
        return articleService.comments(id);
    }

    @PostMapping("/admin/submit")
    public String editor(@RequestBody article articleInfo){
        return articleService.submit(articleInfo);
    }

    @PatchMapping("/admin/change")
    public String change(@RequestBody article articleInfo){
        return articleService.change(articleInfo);
    }

    @DeleteMapping("/admin/delete")
    public String delete(@RequestParam("id") int id) {
        return articleService.delete(id);
    }
}
