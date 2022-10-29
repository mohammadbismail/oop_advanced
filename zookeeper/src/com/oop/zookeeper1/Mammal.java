package com.oop.zookeeper1;

public class Mammal {
	private double energyLevel;
	
	//Constructors 
	public Mammal(){
		this.energyLevel = 100;
	}
	// Getters & Setters 
	public double displayEnergy() {
		System.out.printf("Energy is: %f\n", energyLevel);
		return this.energyLevel;
	}
	public void decreaseBy5() {
		this.energyLevel -= 5;
	}
	public void increaseBy10() {
		this.energyLevel +=10;
	}
	public void decreaseBy10() {
		this.energyLevel -= 10;
	}
}