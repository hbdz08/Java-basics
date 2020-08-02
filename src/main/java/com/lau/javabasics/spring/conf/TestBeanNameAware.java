package com.lau.javabasics.spring.conf;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBeanNameAware implements   BeanNameAware, BeanFactoryAware
{
    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }


}
