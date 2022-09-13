package com.astral.dao_blog.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadController {
//    @RequestMapping("/uploadArticle")
//    public String upload(@RequestParam("article") MultipartFile article) throws FileNotFoundException {
//        String path = ResourceUtils.getURL("classpath:").getPath() + "/static/article";
//        UUID uuid = UUID.randomUUID();
//        String articleName = uuid.toString();
//        try {
//            article.transferTo(new File(path + "/" + articleName));
//        } catch (IllegalStateException | IOException e) {
//            e.printStackTrace();
//        }
//        //SQL修改Update article的
//        return articleName;
//    }
}
