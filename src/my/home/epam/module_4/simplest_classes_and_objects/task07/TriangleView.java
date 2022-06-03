package my.home.epam.module_4.simplest_classes_and_objects.task07;

/*
 * Задача 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания 
 * объектов, вычисления площади, периметра и точки пересечения медиан.
 */

public class TriangleView {

    public void printVertices(Triangle triangle) {
	System.out.println("Треугольник с вершинами А[" + triangle.getVertexAx() + "," + triangle.getVertexAy() + "], " + "B[" + triangle.getVertexBx() + ","
		+ triangle.getVertexBy() + "], " + "C[" + triangle.getVertexCx() + "," + triangle.getVertexCy() + "]");
    }

    public void printPerimeter(double perimeter) {
	System.out.println(String.format("Периметр треугольника равен %.2f", perimeter));
    }

    public void printArea(double area) {
	System.out.println(String.format("Площадь треугольника равна %.2f", area));
    }

    public void printmedianIntersVertex(double medianIntersVertexX, double medianIntersVertexY) {
	System.out.println(String.format("Точка пересечения медиан М[%.2f, %.2f]", medianIntersVertexX, medianIntersVertexY));
    }
}