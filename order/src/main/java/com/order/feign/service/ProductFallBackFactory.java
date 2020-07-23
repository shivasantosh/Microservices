package com.order.feign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class ProductFallBackFactory implements FallbackFactory<ProductFeignService> {

    @Autowired
    private ApplicationContext context;

    @Override
    public ProductFeignService create(Throwable cause) {
        return context.getBean(ProductFeignService.class, cause);
    }

}

