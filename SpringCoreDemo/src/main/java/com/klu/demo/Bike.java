package com.klu.demo;

public class Bike {
   private Engine engine;
   public void setEngine(Engine engine) {
     this.engine=engine;
   }
    
      public void ride() {
        engine.start();
        System.out.println("Bike is Moving...");
      }

	  public void ride1() {
		// TODO Auto-generated method stub
		
	  }
}