package com.astral.dao_blog;

import com.astral.dao_blog.entity.article;
import com.astral.dao_blog.service.AssortService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DaoBlogApplicationTests {
    @Autowired
    AssortService assortService;

    @Test
    void contextLoads() {
        List<article> list=assortService.ofAssort("sort1");
        for (article art:list) {
            System.out.println(art.getTopic());
        }
    }
}
