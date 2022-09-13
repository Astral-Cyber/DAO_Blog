package com.astral.dao_blog.dao;

import com.astral.dao_blog.entity.comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommentDao extends JpaRepository<comment,Integer>, JpaSpecificationExecutor<comment> {
}
