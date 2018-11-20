**thymeleaf** 
    
th:replace
    去除div标签并嵌入内部元素.
    写法： _<div th:replace="common/bar::#sidebar(activeUri='main.html')"></div>
          <div th:replace="~{common/bar::#sidebar(activeUri='main.html')}"></div>_
值传递： 通用值传递 sidebar&activeUri=main.html
        thymeleaf sidebar(activeUri='main.html')

    