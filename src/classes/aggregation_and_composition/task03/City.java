package classes.aggregation_and_composition.task03;

/*
 * Задача 3. Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class City {
    private String name;
    private double area;
    private boolean isCapitalCity;
    private boolean isRegionalCenter;

    public City() {
	super();
    }

    public City(String name, double area, boolean isCapitalCity, boolean isRegionalCenter) {
	super();
	this.name = name;
	this.area = area;
	this.isCapitalCity = isCapitalCity;
	this.isRegionalCenter = isRegionalCenter;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public double getArea() {
	return area;
    }

    public void setArea(double area) {
	this.area = area;
    }

    public boolean isCapitalCity() {
	return isCapitalCity;
    }

    public void setCapitalCity(boolean isCapitalCity) {
	this.isCapitalCity = isCapitalCity;
    }

    public boolean isRegionalCenter() {
	return isRegionalCenter;
    }

    public void setRegionalCenter(boolean isRegionalCenter) {
	this.isRegionalCenter = isRegionalCenter;
    }

    @Override
    public String toString() {
	return name + ". Площадь: " + area + (isCapitalCity ? ", столица" : "") + (isRegionalCenter ? ", областной центр" : "");
    }
}