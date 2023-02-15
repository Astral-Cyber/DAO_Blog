package com.astral.dao_blog.dao;

import com.astral.dao_blog.entity.article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ArticleDao extends JpaRepository<article, Integer>, JpaSpecificationExecutor<article> {
    List<article> findAllByAsName(String name);

    article findByTopic(String topic);

    boolean existsByTopic(String topic);
}
