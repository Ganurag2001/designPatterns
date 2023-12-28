package DesignPattern.AbstractFactoryPattern.Classes.Shapes;

import DesignPattern.AbstractFactoryPattern.Interface.Shapes.Shape;

public class Sqaure implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Sqaure method");
	}

}
