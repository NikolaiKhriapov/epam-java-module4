package my.home.epam.module_4.aggregation_and_composition.task02;

/*
 * Задача 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Wheel {
    private String parameter1;
    private String parameter2;
    private String parameter3;
    private String parameter4;
    private String parameter5;

    public Wheel() {
	super();
    }

    public Wheel(String parameter1, String parameter2, String parameter3, String parameter4, String parameter5) {
	super();
	this.parameter1 = parameter1;
	this.parameter2 = parameter2;
	this.parameter3 = parameter3;
	this.parameter4 = parameter4;
	this.parameter5 = parameter5;
    }

    public String getParameter1() {
	return parameter1;
    }

    public void setParameter1(String parameter1) {
	this.parameter1 = parameter1;
    }

    public String getParameter2() {
	return parameter2;
    }

    public void setParameter2(String parameter2) {
	this.parameter2 = parameter2;
    }

    public String getParameter3() {
	return parameter3;
    }

    public void setParameter3(String parameter3) {
	this.parameter3 = parameter3;
    }

    public String getParameter4() {
	return parameter4;
    }

    public void setParameter4(String parameter4) {
	this.parameter4 = parameter4;
    }

    public String getParameter5() {
	return parameter5;
    }

    public void setParameter5(String parameter5) {
	this.parameter5 = parameter5;
    }

    @Override
    public String toString() {
	return "Колесо [параметр1: " + parameter1 + ", параметр2: " + parameter2 + ", параметр3: " + parameter3 + ", параметр4: " + parameter4 + ", параметр5: " + parameter5 + "]";
    }
}