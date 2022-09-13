# 个人博客——思量DAO

## 一、需求与设计

### 1.后台（作者管理页）

```
通过管理员账号进行身份认证
实现文章的编辑、发布、上传（本地上传md文件）
内置自定义，改变首屏图、一言等api
管理评论
```

### 2.前台（游客访问页）

```
访问页
文章列表
评论功能
文章归类
```

### 3.数据库设计

```Java
article
	int id
	String URL 
	String topic
	Date releaseDate 
	assort as
	List<comment> comments
+++++++++++++++++++++++++++++++++++
assort
	String name
	List<article> article
++++++++++++++++++++++++++++++++++++
comment
	int articleId
	String name
	String content
	Date commentDate
```



