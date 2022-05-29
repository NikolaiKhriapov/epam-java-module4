package classes.aggregation_and_composition.task03;

/*
 * Задача 3. Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class Region {
    private String name;
    private double area;
    private District[] districts;

    public Region() {
	super();
    }

    public Region(String name, double area, District[] districts) {
	super();
	this.name = name;
	this.area = area;
	this.districts = districts;
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

    public District[] getDistricts() {
	return districts;
    }

    public void setDistricts(District[] districts) {
	this.districts = districts;
    }
}