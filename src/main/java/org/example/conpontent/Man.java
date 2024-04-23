package org.example.conpontent;


import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(Human.class)
public class Man {
    static {
        System.out.println("This is one man class");
    }

    public String printMan(){
        return "He is a Man";
    }
}
