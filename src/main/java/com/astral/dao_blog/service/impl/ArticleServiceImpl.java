package com.astral.dao_blog.service.impl;

import com.astral.dao_blog.dao.ArticleDao;
import com.astral.dao_blog.entity.article;
import com.astral.dao_blog.entity.comment;
import com.astral.dao_blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleDao articleDao;

    @Override
    public List<article> show() {
        return articleDao.findAll();
    }

    @Override
    public List<comment> comments() {
        List<article> list = articleDao.findAll();
        article art = list.get(0);
        return art.getComments();
    }
}
