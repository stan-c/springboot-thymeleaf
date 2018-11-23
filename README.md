**thymeleaf** 
    
th:replace
    去除div标签并嵌入内部元素.
    写法： _<div th:replace="common/bar::#sidebar(activeUri='main.html')"></div>
          <div th:replace="~{common/bar::#sidebar(activeUri='main.html')}"></div>_
值传递： 通用值传递 sidebar&activeUri=main.html
        thymeleaf sidebar(activeUri='main.html')
        
        
<br/> 
 
## 手动配置
```xml
demo:
  datasource:
    master:
      driver-class-name: com.mysql.jdbc.Driver
      url: jdbc:mysql://localhost:3306/db_master?useSSL=false&useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&allowMultiQueries=true
      username: root
      password: xxx
    slave1:
      driver-class-name: com.mysql.jdbc.Driver
      url: jdbc:mysql://localhost:3306/db_slave1?useSSL=false&useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&allowMultiQueries=true
      username: root
      password: xxxx
```
 
<br/>
``添加新数据库在 DynamicDataSourceConfiguration 中修改``


    