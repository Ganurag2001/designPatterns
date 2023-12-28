package com.buildingpattern.AbstractClass;

import com.buildingpattern.Item;
import com.buildingpattern.Packing;
import com.buildingpattern.wrapper.Bottle;

public abstract class ColdDrink implements Item{

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public abstract float price();

}
