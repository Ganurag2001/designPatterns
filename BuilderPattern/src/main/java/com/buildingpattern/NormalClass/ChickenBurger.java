package com.buildingpattern.NormalClass;

import com.buildingpattern.AbstractClass.Burger;

public class ChickenBurger extends Burger {

	   @Override
	   public float price() {
	      return 50.5f;
	   }

	   @Override
	   public String name() {
	      return "Chicken Burger";
	   }
	}
