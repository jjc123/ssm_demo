# ssm_demo
使用ssm实现前后台交互的简单栗子：访问网址，返回数据库的数据
 
**访问首页：**
```
http://localhost:8080/ssm_demo/
```
**页面显示：**
Hello SSM!

访问控制器网址，从数据库中获取字段信息
```
http://localhost:8080/ssm_demo/description/infoByRequest.action
```
**页面显示:**
自己动手实现一个精美且实用的JavaWeb后台管理系统

还有使用：mvn clean package可以将项目打包方便部署

# 关于日志问题：
```
log4j.com.ssm.demo.dao=DEBUG
```
把com.ssm.demo.dao包下所有类的日志记录级别设置为DeBUG

