package classes.simplest_classes_and_objects.task10;

import java.util.ArrayList;
import java.util.List;

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

public class Airport {
    private List<Airline> airlines = new ArrayList<Airline>();

    public Airport() {
	super();
    }

    public Airport(List<Airline> airlines) {
	this.airlines = airlines;
    }

    public List<Airline> getAirlines() {
	return airlines;
    }

    public void setAirlines(List<Airline> airlines) {
	this.airlines = airlines;
    }
}