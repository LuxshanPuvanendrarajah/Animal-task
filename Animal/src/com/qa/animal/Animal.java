package com.qa.animal;

public abstract class Animal implements Nutrition,Nature {
  public abstract boolean foundZoo();
  public abstract String colour();
  public abstract int legs();
}