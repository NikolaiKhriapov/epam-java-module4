package my.home.epam.module_4.aggregation_and_composition.task03;

/*
 * Задача 3. Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class District {
    private String name;
    private double area;
    private City city;

    public District() {
	super();
    }

    public District(String name, double area, City city) {
	super();
	this.name = name;
	this.area = area;
	this.city = city;
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

    public City getCity() {
	return city;
    }

    public void setCity(City city) {
	this.city = city;
    }
}