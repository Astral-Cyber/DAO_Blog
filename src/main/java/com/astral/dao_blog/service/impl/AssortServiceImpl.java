package com.astral.dao_blog.service.impl;

import com.astral.dao_blog.dao.ArticleDao;
import com.astral.dao_blog.dao.AssortDao;
import com.astral.dao_blog.entity.article;
import com.astral.dao_blog.entity.assort;
import com.astral.dao_blog.service.AssortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssortServiceImpl implements AssortService {
    @Autowired
    ArticleDao articleDao;
    @Autowired
    AssortDao assortDao;

    @Override
    public List<article> ofAssort(String name) {
        return articleDao.findByAsId(assortDao.findByName(name).getId());
    }

    @Override
    public List<assort> allAssort() {
        return assortDao.findAll();
    }

    @Override
    public String newAssort(String name) {
        try {
            assort assort=new assort();
            assort.setName(name);
            assortDao.save(assort);
        }catch (Exception e){
            return "新建失败";
        }
        return "新建成功";
    }
}
