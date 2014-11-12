package com.example.springdi;

import javax.inject.Inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {

	@Inject
	private SomeStuff someStuff;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		App p = context.getBean(App.class);
		((ConfigurableApplicationContext) context).close();
		p.start(args);
	}

	private void start(String[] args) {
		System.out.println("Hello World!");
		someStuff.printStuff();
	}
}
