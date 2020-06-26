# wx_demo
一个实现了收藏和加载新闻功能的使用springboot+mybatis框架的微信小程序项目
## Requirements（需要）
* Eclipse（可替换）
    * jdk >=1.8（必要）
    * springboot（必要）
* maven（必要）
* sqlserver 2014（可替换）
* 微信开发者工具（必要）
## optional(可选)
* Postman（校验后台返回前段的JSON对象）
## Running(运行)
* 请下载[SQL链接](https://pan.baidu.com/s/18JMQ4yM2iRiGK0iUMFRh4g)  提取码：6uwg
* 在导入完代码和数据库的数据后，需要修改application.yml中的user和password:为本地配置的数据库的账户和密码，再运行LiberaryApplication.java文件，以此开启后端服务。然后再在微信开发者工具中运行前段的文件。
## advice(建议)
 * Eclipse不是必须的开发平台，当然也可以使用IntelliJ IDEA作为开发工具。
 * sqlserver 2014也可以使用MySQL替换，不过需要修改application.yml配置文件中的jdbc配置。
## reference(参考的资源)
* [微信小程序2019快速入门+四个实战小程序](https://www.bilibili.com/video/BV1i4411c7dU)
* [微信小程序后端教学之新闻网开发](https://www.bilibili.com/video/BV1G7411P7Re?t=140&p=9)
* [SpringBoot+MyBatis搭建迷你小程序](https://www.imooc.com/learn/945)

