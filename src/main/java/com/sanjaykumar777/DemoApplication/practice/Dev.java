package com.sanjaykumar777.DemoApplication.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("desktop")
    private Computer compute;
    public void build(){
        compute.compile();
        System.out.println("Building the application");
    }

}
