package com.qa.animal;

public class Tiger extends Animal{
	
	public int weight() {
		System.out.println(150+" kg");
			return 0;}
			
	public String habitat() {
		System.out.println("jungle");
		return null;
		}
	@Override
	public boolean foundZoo() {
		return true;
	}

	@Override
	public String colour() {
	System.out.println("Orange");
	return null;
	}

	@Override
	public int legs() {
	System.out.println(4+" legs");
		return 0;}

	@Override
	public void eat() {
		System.out.println("Animals");
		
	}

	@Override
	public void Sound() {
		System.out.println("roar");
		
	}

}
