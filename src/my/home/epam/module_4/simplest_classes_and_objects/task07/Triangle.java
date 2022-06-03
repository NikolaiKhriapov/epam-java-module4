package my.home.epam.module_4.simplest_classes_and_objects.task07;

/*
 * Задача 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания 
 * объектов, вычисления площади, периметра и точки пересечения медиан.
 */

public class Triangle {
    private double vertexAx;
    private double vertexAy;
    private double vertexBx;
    private double vertexBy;
    private double vertexCx;
    private double vertexCy;

    public Triangle() {
	super();
    }

    public Triangle(double vertexAx, double vertexAy, double vertexBx, double vertexBy, double vertexCx, double vertexCy) {
	super();
	this.vertexAx = vertexAx;
	this.vertexAy = vertexAy;
	this.vertexBx = vertexBx;
	this.vertexBy = vertexBy;
	this.vertexCx = vertexCx;
	this.vertexCy = vertexCy;
    }

    public double getVertexAx() {
	return vertexAx;
    }

    public void setVertexAx(double vertexAx) {
	this.vertexAx = vertexAx;
    }

    public double getVertexAy() {
	return vertexAy;
    }

    public void setVertexAy(double vertexAy) {
	this.vertexAy = vertexAy;
    }

    public double getVertexBx() {
	return vertexBx;
    }

    public void setVertexBx(double vertexBx) {
	this.vertexBx = vertexBx;
    }

    public double getVertexBy() {
	return vertexBy;
    }

    public void setVertexBy(double vertexBy) {
	this.vertexBy = vertexBy;
    }

    public double getVertexCx() {
	return vertexCx;
    }

    public void setVertexCx(double vertexCx) {
	this.vertexCx = vertexCx;
    }

    public double getVertexCy() {
	return vertexCy;
    }

    public void setVertexCy(double vertexCy) {
	this.vertexCy = vertexCy;
    }
}