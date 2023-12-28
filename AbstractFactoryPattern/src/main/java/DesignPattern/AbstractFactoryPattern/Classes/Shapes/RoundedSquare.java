package DesignPattern.AbstractFactoryPattern.Classes.Shapes;

import DesignPattern.AbstractFactoryPattern.Interface.Shapes.Shape;

public class RoundedSquare implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rounded Square");
	}

}
