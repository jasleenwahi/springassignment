package com.knoldus.springbootassignment.controller;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


@Component
public class PrintTime
{
    public String showTime()
    {
        DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.now();
        String todayTime = time.format(FOMATTER);
        return todayTime;
    }
}
