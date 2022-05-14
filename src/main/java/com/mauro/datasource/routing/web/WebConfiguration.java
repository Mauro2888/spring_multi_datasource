package com.mauro.datasource.routing.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    public final HeaderWebInterceptor headerWebInterceptor;

    public WebConfiguration(HeaderWebInterceptor headerWebInterceptor) {
        this.headerWebInterceptor = headerWebInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addWebRequestInterceptor(headerWebInterceptor);
    }
}
