package com.sanjaykumar777.DemoApplication.practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public void compile(){
        System.out.println("compiling using the laptop might be slower");
    }
}
