package my.home.epam.module_4.simplest_classes_and_objects.task10;

import java.util.Arrays;

/*
 * Задача 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
 * и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * 
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Airline {
    private String destinationPoint;
    private String flightNo;
    private String typeOfAircraft;
    private String departureTime;
    private String[] daysOfWeek;

    public Airline() {
	super();
    }

    public Airline(String destinationPoint, String flightNo, String typeOfAircraft, String departureTime, String[] daysOfWeek) {
	super();
	this.destinationPoint = destinationPoint;
	this.flightNo = flightNo;
	this.typeOfAircraft = typeOfAircraft;
	this.departureTime = departureTime;
	this.daysOfWeek = daysOfWeek;
    }

    public String getDestinationPoint() {
	return destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
	this.destinationPoint = destinationPoint;
    }

    public String getFlightNo() {
	return flightNo;
    }

    public void setFlightNo(String flightNo) {
	this.flightNo = flightNo;
    }

    public String getTypeOfAircraft() {
	return typeOfAircraft;
    }

    public void setTypeOfAircraft(String typeOfAircraft) {
	this.typeOfAircraft = typeOfAircraft;
    }

    public String getDepartureTime() {
	return departureTime;
    }

    public void setDepartureTime(String departureTime) {
	this.departureTime = departureTime;
    }

    public String[] getDaysOfWeek() {
	return daysOfWeek;
    }

    public void setDaysOfWeek(String[] daysOfWeek) {
	this.daysOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
	return "Пункт назначения: " + destinationPoint + ", рейс № " + flightNo + ", тип самолета: " + typeOfAircraft 
		+ ", время отправления: " + departureTime + ", дни недели: " + Arrays.toString(daysOfWeek);
    }
}