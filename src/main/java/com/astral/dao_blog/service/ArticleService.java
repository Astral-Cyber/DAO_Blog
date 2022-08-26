package com.astral.dao_blog.service;

import com.astral.dao_blog.entity.article;
import com.astral.dao_blog.entity.comment;

import java.util.List;

public interface ArticleService {
    public List<article> show();
    public List<comment> comments();
}
