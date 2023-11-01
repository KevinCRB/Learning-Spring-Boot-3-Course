package com.udemy.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class pacmanGame implements gamingConsole {

	@Override
	public void up() {
		System.out.println("pacmanGame up");
	}

	@Override
	public void down() {
		System.out.println("pacmanGame down");

	}

	@Override
	public void left() {
		System.out.println("pacmanGame left");

	}

	@Override
	public void right() {
		System.out.println("pacmanGame right");

	}

}
