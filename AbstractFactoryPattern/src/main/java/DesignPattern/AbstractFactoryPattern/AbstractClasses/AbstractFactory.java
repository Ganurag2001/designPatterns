package DesignPattern.AbstractFactoryPattern.AbstractClasses;

import DesignPattern.AbstractFactoryPattern.Interface.Shapes.Shape;

public abstract class AbstractFactory {
	public abstract Shape getShape(String shapeType);
}

