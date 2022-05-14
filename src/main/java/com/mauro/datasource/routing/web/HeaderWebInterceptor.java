package com.mauro.datasource.routing.web;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

@Component
public class HeaderWebInterceptor implements WebRequestInterceptor {

    private final String HEADER_TYPE = "database";

    @Override
    public void preHandle(WebRequest request) throws Exception {
            DataBaseThreadStorage.setDatabaseId(request.getHeader(HEADER_TYPE));
    }

    @Override
    public void postHandle(WebRequest request, ModelMap model) throws Exception {
        DataBaseThreadStorage.clear();
    }

    @Override
    public void afterCompletion(WebRequest request, Exception ex) throws Exception {

    }
}
