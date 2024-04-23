package org.example.conpontent;

import org.springframework.stereotype.Component;

@Component
public class Human {

    static {
        System.out.println("This is one human super class");
    }
}
