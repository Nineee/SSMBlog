USE blogdemo;
/*用户表*/
DROP TABLE IF EXISTS `blog_user`;
CREATE TABLE `blog_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `password` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `blog_user` (`username`,`password`)
    VALUES
      (`123@qq.com`,`123`);

/*文章表*/
DROP TABLE IF EXISTS `blog_articles`;
CREATE TABLE `blog_articles` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(30) NOT NULL,
  `content` TEXT(8000) DEFAULT NULL ,
  `author` varchar(10) DEFAULT NULL,
  `catalog` VARCHAR(10) DEFAULT NULL,
  `tag` VARCHAR(10) DEFAULT NULL,
  `comment` VARCHAR(200) DEFAULT NULL,
  `date` VARCHAR(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `blog_articles` (`title`,`author`,`content`,`catalog`,`tag`,`comment`,`date`)
 VALUES
   ('Zabbix监控','nine',
'到2004年上半年，淘宝网已经运行了一年的时间，这一年积 累了大量的用户，也快速开发了很多功能，当时这个网站已经 很庞大了，而且新的需求还在源源不断地增加。把一个庞大的网 站的开发语言换掉，无异于脱胎换骨，在换的过程中还不能拖慢 业务的发展，这无异于边换边跑，对时间和技术能力的要求都非 常高。做这样的手术，需要请第一流的专家来主刀',
         '运维','监控','还不错哦','2017-10-03'),
  ('Python','nine',
'说了开发模式，再说说用到的Java MVC框架，当时的struts1.x 是用得比较多的框架，但是用过webwork和struts2的人可能知道， struts1.x在多人协作方面有很多致命的弱点，由于没有一个轻量框 架作为基础，因此，很难扩展，这样架构师对于基础功能和全局 功能的控制就很难做到。而阿里巴巴的18个创始人之中，有个架 构师周悦虹，他在Jakarta Turbine的基础上做了很多扩展，打造了 一个阿里巴巴自己用的MVC框架WebX （ http://www.openwebx. org/docs/Webx3_Guide_Book.html ），这个框架易于扩展，方 便组件化开发，它的页面模板支持JSP和Velocity等，持久层支持 ibatis和hibernate等，控制层可以用EJB和Spring（Spring是后来才有 的）。项目组选择了这个强大的框架。另外，当时Sun在全世界大 力推广他们的EJB，虽然淘宝的架构师认为这个东西用不到，但他 们还是极力坚持。在经历了很多次的技术讨论、争论甚至争吵之 后，这个系统的架构就变成了下图的形式。',
   '运维开发','python','还不错哦','2017-10-03'),
  ('Java','nine',
'Sun公司的这帮工程师的确很强大，在笔者2004年年底来淘 宝的时候，他们还在，我有幸与他们共事了几个月。现在摆在他 们面前的问题是用什么办法把一个庞大的网站从PHP语言迁移到 Java？而且要求在迁移的过程中，不停止服务，原来系统的bugfix 和功能改进不受影响。亲，你要是架构师，你怎么做？有人的答 案是写一个翻译器，如同把中文翻译成英文一样，自动翻译。我 只能说你这个想法太超前了，“too young, too simple, sometimes naive”。当时没有，现在也没有人能做到。',
   '开发','java','还不错哦','2017-10-03'),
  ('Linux','nine',
'Sun的这帮工程师开发完淘宝的网站之后，用同样的架构又做 了一个很牛的网站，叫“支付宝”。（上一篇说过支付宝最初是 淘宝上的“安全交易”功能，这个功能后来独立出来，成立了一 个网站，也成立了一个公司，就是现在的支付宝。把支付宝从淘 宝分出去的人，就是Sun公司的这几个人。）下图是支付宝的第一 次员工大会。',
   '运维','Linux','还不错哦','2017-10-03'),
   ('C++','nine',
    '把一个庞大的网 站的开发语言换掉，无异于脱胎换骨，在换的过程中还不能拖慢 业务的发展，这无异于边换边跑，对时间和技术能力的要求都非 常高。做这样的手术，需要请第一流的专家来主刀',
    '运维','监控','还不错哦','2017-10-03'),
   ('GO语言开发','nine',
    '到2004年上半年，淘宝网已经运行了一年的时间，这一年积 累了大量的用户，也快速开发了很多功能，当时这个网站已经 很庞大了，而且新的需求还在源源不断地增加。把一个庞大的网 站的开发语言换掉，无异于脱胎换骨，在换的过程中还不能拖慢 业务的发展，这无异于边换边跑，对时间和技术能力的要求都非 常高。做这样的手术，需要请第一流的专家来主刀',
    '运维','监控','还不错哦','2017-10-03'),
   ('.NET开发','nine',
    '到2004年上半年，淘宝网已经运行了一年的时间，这一年积 累了大量的用户，也快速开发了很多功能，当时这个网站已经 很庞大了，而且新的需求还在源源不断地增加。把一个庞大的网 站的开发语言换掉，无异于脱胎换骨，在换的过程中还不能拖慢 业务的发展，这无异于边换边跑，对时间和技术能力的要求都非 常高。做这样的手术，需要请第一流的专家来主刀',
    '运维','监控','还不错哦','2017-10-03');


