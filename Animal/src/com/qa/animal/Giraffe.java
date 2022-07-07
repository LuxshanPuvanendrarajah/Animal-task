package com.qa.animal;

public class Giraffe extends Animal {
	
	public int hearts() {
		System.out.println(3+" hearts");
			return 0;}
			
	public String neck() {
		System.out.println("Very long");
		return null;}

	@Override
	public boolean foundZoo() {
		return true;
	}

	@Override
	public String colour() {
	System.out.println("Yellow");
	return null;
	}

	@Override
	public int legs() {
	System.out.println(4+" legs");
		return 0;
	}

	@Override
	public void eat() {
			System.out.println("leaves");
				
				}

	@Override
	public void Sound() {
		System.out.println("snort");
		
	}

}
