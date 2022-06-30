package my.home.epam.module_4.aggregation_and_composition.task03;

import java.util.Scanner;

/*
 * Задача 3. Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class Main {

    public static void main(String[] args) {
	StateView stateView = new StateView();
	BelarusDatabase belarusDatabase = new BelarusDatabase();

	State belarus = new State("Республика Беларусь", belarusDatabase.getRegionsOfBelarus());

	printActions(belarus);

	while (true) {
	    initActions(belarus, stateView);
	    System.out.println();
	}
    }

    private static void printActions(State state) {
	System.out.println("Страна: " + state.getName());
	System.out.println();
	System.out.println("Панель управления:");
	System.out.println("1. Вывести на консоль столицу");
	System.out.println("2. Вывести на консоль количество областей");
	System.out.println("3. Вывести на консоль площадь");
	System.out.println("4. Вывести на консоль областные центры");
	System.out.println("0. Завершить работу программы");
	System.out.println("");
    }

    private static void initActions(State state, StateView stateView) {
	switch (inputActionNumber("Введите число: ")) {
	case 1 -> stateView.printCapitalCity(state);
	case 2 -> stateView.printNoOfRegions(state);
	case 3 -> stateView.printStateArea(state);
	case 4 -> stateView.printRegionalCenters(state);
	case 0 -> {
	    System.out.println("Работа программы завершена");
	    System.exit(0);
	}
	}
    }

    private static int inputActionNumber(String message) {
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