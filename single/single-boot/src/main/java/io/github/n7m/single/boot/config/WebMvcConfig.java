package io.github.n7m.single.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration(value = "WebMvcConfig")
public class WebMvcConfig implements WebMvcConfigurer {

    // 拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }

    // 资源处理
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }

}
