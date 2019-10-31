package com.nice.pojo;

import com.nice.pojo.definition.Animal;
import com.nice.pojo.definition.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 人物实现类
 * @author ningh
 */
@Component
public class BussinessPerson implements Person, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {



    @Autowired(required = false)
    @Qualifier("dog")
    private Animal animal;


    @Override
    public void service() {
        this.animal.use();
    }

    @Autowired @Qualifier("dog")
    @Override
    public void setAnimal(Animal animal) {
        System.out.println("延迟依赖注入");
        this.animal = animal;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("["+this.getClass().getSimpleName()+"] 调用BeanFactoryAware的setBeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("["+this.getClass().getSimpleName()+"]调用BeanNameAware的setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("["+this.getClass().getSimpleName()+"] DisposableBean方法");
    }

    @PreDestroy
    public void destory1(){
        System.out.println("["+this.getClass().getSimpleName()+"] 注解PreDestroy定义的自定义的销毁方法");
    }

    @PostConstruct
    public void init(){
        System.out.println("["+this.getClass().getSimpleName()+"] 注解@PostConstruct定义的自定义初始化方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("["+this.getClass().getSimpleName()+"] 调用InitializingBean的afterPropertiesSet方法");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("["+this.getClass().getSimpleName()+"] 调用ApplicationContextAware的setApplicationContext");
    }
}
