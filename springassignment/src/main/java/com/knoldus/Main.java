package com.knoldus;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {
        // creating spring container which will manage our beans.
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // fetching our bean.
        MessagePrinter messagePrinter = (MessagePrinter) applicationContext.getBean("MessagePrinter");
        // printing message.
        messagePrinter.printMessage();
    }
}
