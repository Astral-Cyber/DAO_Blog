package com.astral.dao_blog.dao;

import com.astral.dao_blog.entity.article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ArticleDao extends JpaRepository<article,Integer>, JpaSpecificationExecutor<article> {
        article findByURL(String URL);
        List<article> findByAsId(int id);
        article findByTopic(String topic);
}
