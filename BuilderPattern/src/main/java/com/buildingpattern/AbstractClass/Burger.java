package com.buildingpattern.AbstractClass;

import com.buildingpattern.Item;
import com.buildingpattern.Packing;
import com.buildingpattern.wrapper.Wrapper;

public abstract class Burger implements Item{

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public abstract float price();
	
	

}
