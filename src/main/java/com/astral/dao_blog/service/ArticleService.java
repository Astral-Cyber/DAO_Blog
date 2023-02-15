package com.astral.dao_blog.service;

import com.astral.dao_blog.entity.article;
import com.astral.dao_blog.entity.comment;

import java.util.List;

public interface ArticleService {
    public List<article> show();
    public article getOne(int id);
    public List<comment> comments(int id);
    public String submit(article articleInfo);
    public String change(article articleInfo);

    public String delete(int id);
}
