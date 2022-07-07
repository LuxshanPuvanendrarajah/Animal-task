package com.qa.animal;

public class Elephant extends Animal{
	
	public int weight() {
		System.out.println(4000+" kg");
			return 0;}
			
	public String trunk() {
		System.out.println("Very long");
		return null;
		}
		
	
	@Override
	public boolean foundZoo() {
		return true;
	}

	@Override
	public String colour() {
	System.out.println("Grey");
	return null;
	}

	@Override
	public int legs() {
	System.out.println(4+" legs");
		return 0;}

	@Override
	public void eat() {
		System.out.println("bamboo");
		
	}

	@Override
	public void Sound() {
		System.out.println("trumpet");
		}
}
