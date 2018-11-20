package com.demothymeleaf.config;

import com.demothymeleaf.component.LoginHandlerInteror;
import com.demothymeleaf.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * 自定义拦截器
 *
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {



    @Bean // 将主键注册到容器中
    public  WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer  webMvcConfigurer= new WebMvcConfigurer(){
            /**
             *  拦截 “/” ，“/login.html” 进入模板templates中
             * @param registry
             */
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }


            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandlerInteror()).addPathPatterns("/**")
                        .excludePathPatterns("/","/index.html","/user/login","/webjars/**","/asserts/**");
            }

        };
        return  webMvcConfigurer;
    }

    @Bean
    public MyLocaleResolver localeResolver(){
        return  new MyLocaleResolver();
    }

}
