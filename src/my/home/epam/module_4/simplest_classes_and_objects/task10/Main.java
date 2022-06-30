package my.home.epam.module_4.simplest_classes_and_objects.task10;

import java.util.Scanner;

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

public class Main {

    public static void main(String[] args) {
	AirlineLogic airlineLogic = new AirlineLogic();
	AirlineView airlineView = new AirlineView();

	Airport airport = airlineLogic.initAirport();

	showActions();

	while (true) {
	    initActions(airport, airlineView);
	    System.out.println();
	}
    }

    private static void showActions() {
	System.out.println("Панель управления:");
	System.out.println("1. Показать список всех рейсов");
	System.out.println("2. Показать список рейсов для заданного пункта назначения");
	System.out.println("3. Показать список рейсов для заданного дня недели");
	System.out.println("4. Показать список рейсов для заданного дня недели, время вылета для которых больше заданного");
	System.out.println("0. Завершить работу программы");
	System.out.println("");
    }

    private static void initActions(Airport airport, AirlineView airlineView) {
	switch (console("Введите число: ")) {
	case 1 -> {
	    System.out.println("Cписок всех рейсов:");
	    airlineView.printAllAirlines(airport.getAirlines());
	}
	case 2 -> airlineView.printFlightsByDestinationPoint(airport.getAirlines());
	case 3 -> airlineView.printFlightsByDayOfWeek(airport.getAirlines());
	case 4 -> airlineView.printFlightsByDayAndMinTime(airport.getAirlines());
	case 0 -> {
	    System.out.println("Работа программы завершена!");
	    System.exit(0);
	}
	}
    }

    private static int console(String message) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);

	System.out.print(message);
	while (!scanner.hasNextInt()) {
	    System.out.print(message);
	    scanner.next();
	}

	return scanner.nextInt();
    }
}