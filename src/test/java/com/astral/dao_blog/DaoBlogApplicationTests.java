package com.astral.dao_blog;

import com.astral.dao_blog.dao.ArticleDao;
import com.astral.dao_blog.dao.AssortDao;
import com.astral.dao_blog.entity.article;
import com.astral.dao_blog.entity.comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DaoBlogApplicationTests {
    @Autowired
    ArticleDao articleDao;
    @Autowired
    AssortDao assortDao;

    @Test
    void contextLoads() {
        List<article> list= articleDao.findAll();
        for (article art:list) {
            System.out.println(art.getURL() + " " + art.getAs().getName());
            for (comment com : art.getComments()) {
                System.out.println(com.getContent());
            }
            System.out.println("+++++++++++++++++++++++++++++++++++");
        }
//        List<assort> list = assortDao.findAll();
//        for (assort as : list) {
//            for (article art:as.getArticles()) {
//                System.out.println(art.getURL());
//            }
//        }
    }
}
