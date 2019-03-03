package com.quest;



import java.util.*;


public class QuestMain {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		 String getName = scan.next();
//		int age = scan.nextInt();
		Person knight = new Knight(getName);
		Person superman = new Superman(getName);
		Person zombie = new Zombie(getName);
//		Person speed = new Speed(getSpeed);

		knight.getName();
		superman.getName();
		zombie.getName();
		
//		knight.getWeapon();		
//		superman.getSpeed();
//		zombie.getDeathDate();
	}
}
