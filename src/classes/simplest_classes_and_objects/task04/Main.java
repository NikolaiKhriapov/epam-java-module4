package classes.simplest_classes_and_objects.task04;

import java.util.Scanner;

/*
 * Задача 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по 
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте 
 * возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть 
 * упорядочены по времени отправления.
 */

public class Main {

    public static void main(String[] args) {
	TrainsView trainsView = new TrainsView();
	TrainsLogic trainsLogic = new TrainsLogic();

	Train[] trains = trainsLogic.initTrains();

	printActions();

	while (true) {
	    initActions(trains, trainsView, trainsLogic);
	    System.out.println();
	}
    }

    private static void printActions() {
	System.out.println("Панель управления:");
	System.out.println("1. Вывод информации о поезде");
	System.out.println("2. Сортировка поездов по номеру поезда");
	System.out.println("3. Сортировка поездов по пункту назначения");
	System.out.println("(4. Вывод информации о всех поездах)");
	System.out.println("0. Завершить работу программы");
	System.out.println();
    }

    private static void initActions(Train[] trains, TrainsView trainsView, TrainsLogic trainsLogic) {
	switch (inputNumber("Введите число: ")) {
	case 1 -> trainsView.printTrainByNumber(trains, "Введите номер поезда: ");
	case 2 -> {
	    trainsLogic.sortTrainsByTrainNo(trains);
	    System.out.println("Поезда отсортированы по номеру поезда");
	}
	case 3 -> {
	    trainsLogic.sortTrainsByDestPoint(trains);
	    System.out.println("Поезда отсортированы по пункту назначения");
	}
	case 4 -> trainsView.printAllTrains(trains);
	}
    }

    private static int inputNumber(String message) {
	int number;

	do {
	    @SuppressWarnings("resource")
	    Scanner console = new Scanner(System.in);

	    System.out.print(message);
	    while (!console.hasNextInt()) {
		System.out.print(message);
		console.next();
	    }
	    number = Integer.parseInt(console.next());
	} while ((number < 1) || (number > 4));

	return number;
    }
}