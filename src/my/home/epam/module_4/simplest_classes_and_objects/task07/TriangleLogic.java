package my.home.epam.module_4.simplest_classes_and_objects.task07;

/*
 * Задача 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания 
 * объектов, вычисления площади, периметра и точки пересечения медиан.
 */

public class TriangleLogic {

    public double getSideAB(Triangle triangle) {
	return Math.sqrt((Math.pow(triangle.getVertexBx() - triangle.getVertexAx(), 2)) + (Math.pow(triangle.getVertexBy() - triangle.getVertexAy(), 2)));
    }

    public double getSideBC(Triangle triangle) {
	return Math.sqrt((Math.pow(triangle.getVertexCx() - triangle.getVertexBx(), 2)) + (Math.pow(triangle.getVertexCy() - triangle.getVertexBy(), 2)));
    }

    public double getSideAC(Triangle triangle) {
	return Math.sqrt((Math.pow(triangle.getVertexCx() - triangle.getVertexAx(), 2)) + (Math.pow(triangle.getVertexCy() - triangle.getVertexAy(), 2)));
    }

    public double getPerimeter(Triangle triangle) {
	return getSideAB(triangle) + getSideBC(triangle) + getSideAC(triangle);
    }

    public double getArea(Triangle triangle) {
	double halfPerimeter = getPerimeter(triangle) / 2.0;
	return halfPerimeter * (halfPerimeter - getSideAB(triangle)) * (halfPerimeter - getSideBC(triangle)) * (halfPerimeter - getSideAC(triangle));
    }

    public double getMedianIntersVertexX(Triangle triangle) {
	return (triangle.getVertexAx() + triangle.getVertexBx() + triangle.getVertexCx()) / 3;
    }

    public double getMedianIntersVertexY(Triangle triangle) {
	return (triangle.getVertexAy() + triangle.getVertexBy() + triangle.getVertexCy()) / 3;
    }
}