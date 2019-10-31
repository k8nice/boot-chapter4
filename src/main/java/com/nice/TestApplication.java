package com.nice;

import com.nice.config.AppConfig;
import com.nice.pojo.BussinessPerson;
import com.nice.pojo.Cat;
import com.nice.pojo.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ningh
 */
public class TestApplication {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        BussinessPerson bussinessPerson = (BussinessPerson) applicationContext.getBean("bussinessPerson");
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.close();
    }

}
