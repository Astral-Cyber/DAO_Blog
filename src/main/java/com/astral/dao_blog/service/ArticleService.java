package com.astral.dao_blog.service;

import com.astral.dao_blog.entity.article;
import com.astral.dao_blog.entity.comment;
import com.astral.dao_blog.util.articleInfo;

import java.util.List;

public interface ArticleService {
    public List<article> show();
    public List<comment> comments(String url);
    public String submit(articleInfo articleInfo);
    public String delete(int id);
}
