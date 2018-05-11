package com.cherevko.dmytro;

import com.cherevko.dmytro.impls.robot.ModelT1000;
import com.cherevko.dmytro.impls.robot.ModelT5000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args){

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application.xml");

		ModelT1000 t1000 = (ModelT1000) applicationContext.getBean("t1000");
        t1000.action();

        ModelT5000 t5000 = (ModelT5000) applicationContext.getBean("t5000");
        t5000.action();
    }
}
