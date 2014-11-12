package com.example.springdi;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class SomeStuff {

	@Inject
	SomeMoreStuff someMoreStuff;

	public void printStuff() {
		System.out.println("Hello Spring DI!");
		someMoreStuff.printMoreStuff();
	}

}
