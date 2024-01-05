package com.sproincore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	   ApplicationContext context=new ClassPathXmlApplicationContext("com/sproincore/spel/spelconfig.xml");
       Demo demo=(Demo) context.getBean("demo");
       System.out.println(demo);
	}

}
