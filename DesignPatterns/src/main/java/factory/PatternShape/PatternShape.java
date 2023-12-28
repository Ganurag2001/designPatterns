package factory.PatternShape;

import factory.Pattern.Circle;
import factory.Pattern.Rectangle;
import factory.Pattern.Shape;

public class PatternShape {

	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		}
		return null;
	}
}
