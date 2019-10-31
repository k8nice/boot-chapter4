package com.nice.pojo;

import com.nice.pojo.definition.Animal;
import org.springframework.stereotype.Component;

/**
 * 狗的实现类
 * @author ningh
 */
@Component
public class Dog implements Animal {
    @Override
    public void use() {
        System.out.println("狗[" + Dog.class.getSimpleName() + "]是看门用的.");
    }
}
