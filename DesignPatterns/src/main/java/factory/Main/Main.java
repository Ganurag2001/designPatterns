package factory.Main;

import factory.Pattern.Shape;
import factory.PatternShape.PatternShape;

public class Main {
	public static void main(String[] args) {
		PatternShape patternShape = new PatternShape();

		Shape shape1 = patternShape.getShape("CIRCLE");

		shape1.draw();

		Shape shape2 = patternShape.getShape("RECTANGLE");

		shape2.draw();

	}
}
