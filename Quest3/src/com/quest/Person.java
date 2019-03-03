package com.quest;

import java.util.*;

public abstract class Person {
	protected String name;
	Scanner scan = new Scanner(System.in);
	String getName = scan.next();

	public Person(String name) {
		this.name = name;
//		System.out.println("Enter1");
//
//	System.out.println("Enter2");
//	
//System.out.println("Enter21");
}

	abstract void sayName();

	public String getName() {
		System.out.println("Enter name: ");
		String getName = scan.next();
		System.out.println("My name is "+getName+ " and I'm a "+ getClass());
		System.out.println();
		return getName();
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Enter3");
	}


//	abstract void getWeapon();
//
//	abstract void getSpeed();
//
//	abstract void getDeathDate();
//
//	abstract void increaseSpeed();
//
//	abstract void decreaseSpeed();

}
