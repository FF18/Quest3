package com.quest;

public class Superman extends Person {
	private int speed;

	public Superman(String name) {
		super(name);
	}

//	public void sayName() {
//		System.out.println("Enter superman name: ");
//		String getName = scan.next();
//		System.out.println("My name is  " + getName + " and I'm a superman. ");
//		System.out.println();
//	}
	public void getSpeed() {
		return;
	}

	public void increaseSpeed() {
//		System.out.println("What is your speed: ");
//		String getSpeed = scan.next();
		if (speed <= 50) {
			System.out.println("Superman is increasing speed ");
			
		}
		return;
	}

	public void decreaseSpeed() {
//		System.out.println("What is your speed: ");
//		String getSpeed = scan.next();
		if (speed > 90) {
			System.out.println("Superman is decreasing speed ");
		}
		return;
	}

	@Override
	void sayName() {
		// TODO Auto-generated method stub
		
	}


}
