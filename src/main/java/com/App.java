package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.UserController;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(container);

		UserController userController1 = container.getBean("userController", UserController.class);
		UserController userController2 = container.getBean("userController", UserController.class);
		UserController userController3 = container.getBean("userController", UserController.class);

		System.out.println(userController1);
		System.out.println(userController2);
		System.out.println(userController3);

		System.out.println(userController1.getSalary());
		System.out.println(userController1.getName());

		container.registerShutdownHook();

	}
}
