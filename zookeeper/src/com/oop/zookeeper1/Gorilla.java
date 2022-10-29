package com.oop.zookeeper1;

public class Gorilla extends Mammal{
	
//Getters & Setters 
	public void throughSomething() {
		System.out.println("Something has been thrown\n");
		this.decreaseBy5();
		this.displayEnergy();
	}
	public void eatBanans() {
		System.out.println("Gorilla is happy\n");
		this.increaseBy10();
		this.displayEnergy();
	}
	public void climb() {
		System.out.println("Gorilla had clibmed a tree!\n");
		this.decreaseBy10();
		this.displayEnergy();
	}
}
