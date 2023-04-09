package com.knoldus.springbootassignment.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // this controller will recieve all the http requests.
public class HelloController
{
    @Autowired
    PrintTime printTime; // created a seperate class which contains method to print the time, autowiring the dependency here.
    @GetMapping("/status") // here we are doing a get mapping when user hits this url the controller will recieve and will map it to this method and status will be didplayed.
    public String showStatus(){
        return "Running " + printTime.showTime(); 
    }
}
