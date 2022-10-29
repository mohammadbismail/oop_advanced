package com.oop.zookeeper1;

public class Bat extends Mammal{
	public Bat() {
		this.setEnergy(300);
	}
	public void fly() {
	System.out.println("Bat sound");
	this.decreaseBy50();
	this.displayEnergy();
	}
	public void eatHumans() {
	System.out.println("One human has been eaten");
	this.increaseBy25();
	this.displayEnergy();
	}
	public void attackTown() {
		System.out.println("Town on fire!");
		this.decreaseBy50();
		this.decreaseBy50();
		this.displayEnergy();
	}
}
