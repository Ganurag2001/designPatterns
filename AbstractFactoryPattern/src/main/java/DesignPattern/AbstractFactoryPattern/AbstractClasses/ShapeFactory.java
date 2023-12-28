package DesignPattern.AbstractFactoryPattern.AbstractClasses;

import DesignPattern.AbstractFactoryPattern.Classes.Shapes.Rectangle;
import DesignPattern.AbstractFactoryPattern.Classes.Shapes.Sqaure;
import DesignPattern.AbstractFactoryPattern.Interface.Shapes.Shape;

public class ShapeFactory extends AbstractFactory{
	
	@Override
	public Shape getShape(String shapeType) {
	     if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Sqaure();
	      }	 
	      return null;
	   }

}
