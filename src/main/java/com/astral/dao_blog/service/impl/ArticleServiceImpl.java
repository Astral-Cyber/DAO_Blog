package com.astral.dao_blog.service.impl;

import com.astral.dao_blog.dao.ArticleDao;
import com.astral.dao_blog.dao.AssortDao;
import com.astral.dao_blog.entity.article;
import com.astral.dao_blog.entity.comment;
import com.astral.dao_blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleDao articleDao;

    @Autowired
    AssortDao assortDao;

    @Override
    public List<article> show() {
        return articleDao.findAll();
    }

    @Override
    public article getOne(int id) {
        return articleDao.findById(id).get();
    }

    @Override
    public List<comment> comments(int id) {
        article art = articleDao.findById(id).get();
        return art.getComments();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String submit(article articleInfo) {
        try {
            if (!assortDao.existsByName(articleInfo.getAs().getName())) {
                assortDao.save(articleInfo.getAs());
            }
            if (articleDao.existsByTopic(articleInfo.getTopic()))
                return "存在同名文章，请重试～";
            articleDao.saveAndFlush(articleInfo);
//            String path = ResourceUtils.getURL("classpath:").getPath() + "/static/article";
//            String articleName = articleInfo.getForm().getTopic();

            //判断目标文件所在的目录是否存在 防止丢失目录
//            if(!file.getParentFile().exists()) {
//                //如果目标文件所在的目录不存在，则创建父目录
//                System.out.println("目标文件所在目录不存在，准备创建它！");
//                if(!file.getParentFile().mkdirs()) {
//                    System.out.println("创建目标文件所在目录失败！");
//                    return false;
//                }
//            }
            //保存Content为文件
//            System.out.println(path);
//            byte[] contentByte = articleInfo.getContent().getBytes();
//            File file = new File(path + "/" + articleName + ".md");
//            FileOutputStream outStream = new FileOutputStream(file);
//            outStream.write(contentByte);
//            outStream.close();    //关闭文件输出流
        } catch (Exception e) {
            return "发布失败，请重试～";
        }
        return "发布成功！";
    }

    @Override
    public String change(article articleInfo) {
        try {
            if (!assortDao.existsByName(articleInfo.getAs().getName())) {
                assortDao.save(articleInfo.getAs());
            }
            //修改文件内容
//            String path = ResourceUtils.getURL("classpath:").getPath() + "/static/article";
//            //保存Content为文件
//            byte[] contentByte = articleInfo.getContent().getBytes();
//            article origin = articleDao.findById(articleInfo.getForm().getId()).get();
//            File file = new File(path + "/" + origin.getContent() + ".md");
//            FileOutputStream outputStream = new FileOutputStream(file);
//            outputStream.write(contentByte);
//            Files.move(file.toPath(),file.toPath().resolveSibling(articleInfo.getForm().getContent()+".md"));
//            outputStream.close();    //关闭文件输出流
            articleDao.save(articleInfo);
        } catch (Exception e) {
            return "修改失败，请重试～";
        }
        return "修改成功！";
    }

    @Override
    public String delete(int id) {
        try {
//            article origin = articleDao.findById(id).get();
//            String path = ResourceUtils.getURL("classpath:").getPath() + "/static/article";
//            System.out.println(path);
//            Files.delete(Paths.get(path + "/" + origin.getContent() + ".md"));
            articleDao.deleteById(id);
        } catch (Exception e) {
            return "删除失败，请重试～";
        }
        return "删除成功！";
    }
}
