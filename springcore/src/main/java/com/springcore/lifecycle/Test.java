package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifecycleconfig.xml");
		/*
		 * Samosa samosa=(Samosa) context.getBean("samosa"); System.out.println(samosa);
		 */
		context.registerShutdownHook();
		/*
		 * System.out.println("++++++++++++++++++++++++");
		 * 
		 * Pepsi pepsi=(Pepsi) context.getBean("pepsi"); System.out.println(pepsi);
		 */

		Exampale exampale = (Exampale) context.getBean("exampale");
		System.out.println(exampale);

	}

}
