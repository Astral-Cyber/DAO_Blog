package com.astral.dao_blog.service;

import com.astral.dao_blog.entity.article;
import com.astral.dao_blog.entity.assort;

import java.util.List;

public interface AssortService {
    public List<article> ofAssort(String name);

    public List<assort> allAssort();
    public String newAssort(String name);
}
