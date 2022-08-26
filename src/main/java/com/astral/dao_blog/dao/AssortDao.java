package com.astral.dao_blog.dao;

import com.astral.dao_blog.entity.assort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AssortDao extends JpaRepository<assort,Integer>, JpaSpecificationExecutor<assort> {
}
