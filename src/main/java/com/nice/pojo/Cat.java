package com.nice.pojo;

import com.nice.pojo.definition.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 猫的实现类
 * @author ningh
 */
@Component
@Primary
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("猫["+Cat.class.getSimpleName()+"]是抓老鼠");
    }
}
