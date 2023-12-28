package DesignPattern.AbstractFactoryPattern.Classes.Shapes;

import DesignPattern.AbstractFactoryPattern.Interface.Shapes.Shape;

public class RoundedRectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside RoundedRectangle");
	}

}
