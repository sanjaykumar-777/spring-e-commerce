package com.sanjaykumar777.DemoApplication.practice;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public void compile(){
        System.out.println("compiling via desktop might be faster compared to laptop");
    }

}
