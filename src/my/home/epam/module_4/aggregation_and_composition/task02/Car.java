package my.home.epam.module_4.aggregation_and_composition.task02;

/*
 * Задача 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Car {
    private String brand;
    private String model;
    private String color;
    private int maxSpeed;
    private int yearOfManufacture;
    private Engine engine;
    private Wheel[] wheels;

    public Car() {
	super();
    }

    public Car(String brand, String model, String color, int maxSpeed, int yearOfManufacture, Engine engine, Wheel[] wheels) {
	super();
	this.brand = brand;
	this.model = model;
	this.color = color;
	this.maxSpeed = maxSpeed;
	this.yearOfManufacture = yearOfManufacture;
	this.engine = engine;
	this.wheels = wheels;
    }

    public String getBrand() {
	return brand;
    }

    public void setBrand(String brand) {
	this.brand = brand;
    }

    public String getModel() {
	return model;
    }

    public void setModel(String model) {
	this.model = model;
    }

    public String getColor() {
	return color;
    }

    public void setColor(String color) {
	this.color = color;
    }

    public int getMaxSpeed() {
	return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
    }

    public int getYearOfManufacture() {
	return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
	this.yearOfManufacture = yearOfManufacture;
    }

    public Engine getEngine() {
	return engine;
    }

    public void setEngine(Engine engine) {
	this.engine = engine;
    }

    public Wheel[] getWheels() {
	return wheels;
    }

    public void setWheels(Wheel[] wheels) {
	this.wheels = wheels;
    }

    @Override
    public String toString() {
	return brand + " " + model + ", цвет: " + color + ", макс. скорость: " + maxSpeed + " км/ч, год выпуска: " + yearOfManufacture;
    }
}