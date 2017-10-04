use blogdemo;
/*用户表*/
DROP TABLE IF EXISTS `blog_user`;
CREATE TABLE `blog_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `password` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*文章列表*/
DROP TABLE IF EXISTS `blog_articles`;
CREATE TABLE `blog_articles` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(30) NOT NULL,
  `author` varchar(10) DEFAULT NULL,
  `catalog` VARCHAR(10) DEFAULT NULL,
  `tag` VARCHAR(10) DEFAULT NULL,
  `comment` VARCHAR(200) DEFAULT NULL,
  `date` VARCHAR(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `blog_articles` (`title`,`author`,`catalog`,`tag`,`comment`,`date`)
VALUES ('zabbix','nine','运维','监控','还不错哦','2017-10-03'),
  ('python','nine','运维开发','python','还不错哦','2017-10-03'),
  ('java','nine','开发','java','还不错哦','2017-10-03'),
  ('Linux','nine','运维','Linux','还不错哦','2017-10-03');


