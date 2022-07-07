package com.qa.animal;

public class Lion extends Animal{
	
public int teeth() {
		System.out.println(30+" Teeths");
			return 0;}
			
	public String manecolour() {
		System.out.println("Brown");
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
		return 0;}

	@Override
	public void eat() {
		
			System.out.println("animals");
		
	}

	@Override
	public void Sound() {
		System.out.println("roar");
	}

}
