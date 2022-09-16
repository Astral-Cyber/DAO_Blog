package com.astral.dao_blog.service.impl;

import com.astral.dao_blog.dao.ArticleDao;
import com.astral.dao_blog.entity.article;
import com.astral.dao_blog.entity.comment;
import com.astral.dao_blog.service.ArticleService;
import com.astral.dao_blog.util.articleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileOutputStream;
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
    public List<comment> comments(String url) {
        article art = articleDao.findByURL(url);
        return art.getComments();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String submit(articleInfo articleInfo){
        try {
            try {
                if (!articleDao.findByTopic(articleInfo.getForm().getTopic()).getTopic().isEmpty())
                    return "存在同名文章，请重试～";
            }catch (NullPointerException e) {
                articleDao.saveAndFlush(articleInfo.getForm());
                String path = ResourceUtils.getURL("classpath:").getPath() + "/static/article";
                String articleName = articleInfo.getForm().getTopic();
                //保存Content为文件
                byte[] contentByte = articleInfo.getContent().getBytes();
                File file = new File(path + "/" + articleName + ".md");
                if (!file.exists())
                    file.createNewFile();
                FileOutputStream outStream = new FileOutputStream(file);
                outStream.write(contentByte);
                outStream.close();    //关闭文件输出流
            }
        } catch (Exception e) {
            return "发布失败，请重试～";
        }
        return "发布成功！";
    }

    @Override
    public String delete(int id) {
        try {
        articleDao.deleteById(id);
        }catch (Exception e){
            return "删除失败，请重试～";
        }
        return "删除成功！";
    }
}
