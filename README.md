# java-mybatis-spirng-mvc-example
这个是自己没事的时候搭建的简单的java工程  用的 spring 的 ssm框架 
# 构建工具
用的是maven构建的 
# 编译部署
内置jetty运行配合eclipse maven插件运行  
# mybatis
使用的是mapper接口代理开发
# spring-mvc
使用`org.springframework.web.servlet.view.json.MappingJacksonJsonView`默认处理生成json数据  
使用`org.springframework.web.servlet.view.ContentNegotiatingViewResolver`根据后缀匹配返回内容
# spring事务
使用的是`org.springframework.jdbc.datasource.DataSourceTransactionManager`  
# 数据库连接池
使用的是dbcp
# 遇到的问题
如果ajax请求格式contenttype不填写的话默认需要用一个实体类来接受传到后台的参数  如果想用.request.getparameter()方法的话
需要将contenttype设置为application/x-www-form-urlencoded
