package classes.simplest_classes_and_objects.task07;

import java.util.Random;

/*
 * Задача 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания 
 * объектов, вычисления площади, периметра и точки пересечения медиан.
 */

public class Main {

    public static void main(String[] args) {
	TriangleLogic triangleLogic = new TriangleLogic();
	TriangleView triangleView = new TriangleView();

	double perimeter;
	double area;
	double medianIntersVertexX;
	double medianIntersVertexY;

	Triangle triangle = new Triangle();

	initVertices(triangle, triangleLogic);

	perimeter = triangleLogic.getPerimeter(triangle);
	area = triangleLogic.getArea(triangle);
	medianIntersVertexX = triangleLogic.getMedianIntersVertexX(triangle);
	medianIntersVertexY = triangleLogic.getMedianIntersVertexY(triangle);

	triangleView.printVertices(triangle);
	System.out.println();
	triangleView.printPerimeter(perimeter);
	triangleView.printArea(area);
	triangleView.printmedianIntersVertex(medianIntersVertexX, medianIntersVertexY);
    }

    private static void initVertices(Triangle triangle, TriangleLogic triangleLogic) {
	Random random = new Random();

	int rangeMin = 7;
	int rangeMax = 10;

	do {
	    triangle.setVertexAx(random.nextInt(rangeMin, rangeMax));
	    triangle.setVertexAy(random.nextInt(rangeMin, rangeMax));
	    triangle.setVertexBx(random.nextInt(rangeMin, rangeMax));
	    triangle.setVertexBy(random.nextInt(rangeMin, rangeMax));
	    triangle.setVertexCx(random.nextInt(rangeMin, rangeMax));
	    triangle.setVertexCy(random.nextInt(rangeMin, rangeMax));
	} while (((triangle.getVertexAx() == triangle.getVertexBx()) && (triangle.getVertexAy() == triangle.getVertexBy()))
		|| ((triangle.getVertexBx() == triangle.getVertexCx()) && (triangle.getVertexBy() == triangle.getVertexCy()))
		|| ((triangle.getVertexAx() == triangle.getVertexCx()) && (triangle.getVertexAy() == triangle.getVertexCy()))
		|| (triangleLogic.getSideAB(triangle) == triangleLogic.getSideBC(triangle) + triangleLogic.getSideAC(triangle))
		|| (triangleLogic.getSideBC(triangle) == triangleLogic.getSideAC(triangle) + triangleLogic.getSideAB(triangle))
		|| (triangleLogic.getSideAC(triangle) == triangleLogic.getSideAB(triangle) + triangleLogic.getSideBC(triangle)));
    }
}