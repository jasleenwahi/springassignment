package com.knoldus.springbootassignment.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @Autowired
    PrintTime printTime;
    @GetMapping("/status")
    public String showStatus(){
        return "Running " + printTime.showTime();
    }
}
