package com.astral.dao_blog;

import com.astral.dao_blog.dao.ArticleDao;
import com.astral.dao_blog.service.AssortService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;

@SpringBootTest
class DaoBlogApplicationTests {
    @Autowired
    AssortService assortService;
    @Autowired
    ArticleDao articleDao;

    @Test
    void contextLoads() throws FileNotFoundException {
    }
}
