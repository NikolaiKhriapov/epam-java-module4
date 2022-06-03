package my.home.epam.module_4.simplest_classes_and_objects.task10;

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

public class AirlineView {
    private AirlineLogic airlineLogic = new AirlineLogic();

    public void printAirline(Airline airline) {
	System.out.println(airline.toString());
    }

    public void printAllAirlines(List<Airline> airlines) {
	for (Airline airline : airlines) {
	    printAirline(airline);
	}
    }

    public void printFlightsByDestinationPoint(List<Airline> airlines) {
	List<Airline> airlinesFound = new ArrayList<Airline>();

	String destinationPoint = airlineLogic.inputData("Укажите пункт назначения: ");
	int count = 0;

	for (Airline airline : airlines) {
	    if (airline.getDestinationPoint().toLowerCase().equals(destinationPoint.toLowerCase())) {
		airlinesFound.add(airline);
		count++;
	    }
	}

	if (count == 0) {
	    System.out.println("Рейсов для указанного пункта назначения не найдено!");
	} else {
	    System.out.println("\nCписок рейсов для указанного пункта назначения:");
	    printAllAirlines(airlinesFound);
	}
    }

    public void printFlightsByDayOfWeek(List<Airline> airlines) {
	List<Airline> airlinesFound = new ArrayList<Airline>();

	String dayOfWeek = airlineLogic.inputData("Введите день недели: ");
	int count = 0;

	for (Airline airline : airlines) {
	    String[] daysOfWeek = airline.getDaysOfWeek();
	    for (int i = 0; i < daysOfWeek.length; i++) {
		if (daysOfWeek[i].toLowerCase().equals(dayOfWeek.toLowerCase())) {
		    airlinesFound.add(airline);
		    count++;
		}
	    }
	}

	if (count == 0) {
	    System.out.println("Рейсов для указанного дня недели не найдено!");
	} else {
	    System.out.println("\nCписок рейсов для указанного дня недели:");
	    printAllAirlines(airlinesFound);
	}
    }

    public void printFlightsByDayAndMinTime(List<Airline> airlines) {
	List<Airline> airlinesFound = new ArrayList<Airline>();

	String dayOfWeek = airlineLogic.inputData("Укажите день недели: ");
	String minTime = airlineLogic.inputData("Укажите самое раннее время вылета: ");
	int count = 0;

	for (Airline airline : airlines) {
	    // отбор по дню недели
	    for (int i = 0; i < airline.getDaysOfWeek().length; i++) {
		if (airline.getDaysOfWeek()[i].toLowerCase().equals(dayOfWeek.toLowerCase())) {
		    // отбор по времени вылета
		    if (airline.getDepartureTime().compareTo(minTime) >= 0) {
			airlinesFound.add(airline);
			count++;
		    }
		}
	    }
	}

	if (count == 0) {
	    System.out.println("Рейсов для указанного дня недели и времени вылета не найдено!");
	} else {
	    System.out.println("\nCписок рейсов для указанного дня недели и времени вылета:");
	    printAllAirlines(airlinesFound);
	}
    }
}