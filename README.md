**springboot-thymeleaf**
**HTML页面**
```html
th:replace
    去除div标签并嵌入内部元素,使用 th:replace
    写法： 
        <div th:replace="common/bar::#sidebar(activeUri='main.html')"></div>
         <div th:replace="~{common/bar::#sidebar(activeUri='main.html')}"></div>_
通用值传递，sidebar&activeUri=main.html。
thymeleaf sidebar(activeUri='main.html')
```       

**java**

**REST风格：**

    1、GET 获取资源
    2、POST 新建资源
    3、PUT 更新资源
    <input type="hidden" name="_method" value="put">
    4、DELETE 删除资源

1、多数据源控制 DynamicDataSourceConfiguration

2、自定义错误信息 BusinessException  BaseController



    