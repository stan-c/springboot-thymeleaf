**thymeleaf** 
    
```html
th:replace
    去除div标签并嵌入内部元素,使用 th:replace
    写法： 
        <div th:replace="common/bar::#sidebar(activeUri='main.html')"></div>
         <div th:replace="~{common/bar::#sidebar(activeUri='main.html')}"></div>_
通用值传递，sidebar&activeUri=main.html。
thymeleaf sidebar(activeUri='main.html')
```       
<br/> 
 
 ```java

```



    