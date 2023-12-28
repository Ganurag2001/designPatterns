package com.buildingpattern.NormalClass;

import com.buildingpattern.AbstractClass.ColdDrink;

public class Coke extends ColdDrink {

	   @Override
	   public float price() {
	      return 30.0f;
	   }

	   @Override
	   public String name() {
	      return "Coke";
	   }
	}
