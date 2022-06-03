package my.home.epam.module_4.aggregation_and_composition.task03;

/*
 * Задача 3. Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class State {
    private String name;
    private Region[] regions;

    public State() {
	super();
    }

    public State(String name, Region[] regions) {
	super();
	this.name = name;
	this.regions = regions;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Region[] getRegions() {
	return regions;
    }

    public void setRegions(Region[] regions) {
	this.regions = regions;
    }
}