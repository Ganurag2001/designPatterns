package DesignPattern.AbstractFactoryPattern.FactoryProducer;

import DesignPattern.AbstractFactoryPattern.AbstractClasses.AbstractFactory;
import DesignPattern.AbstractFactoryPattern.AbstractClasses.RoundedShapeFactory;
import DesignPattern.AbstractFactoryPattern.AbstractClasses.ShapeFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(boolean rounded) {
		if(rounded) {
			return new RoundedShapeFactory();
		}
		else {
			return new ShapeFactory();
		}
	}

}
