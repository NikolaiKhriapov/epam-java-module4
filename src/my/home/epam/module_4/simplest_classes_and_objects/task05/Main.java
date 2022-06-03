package my.home.epam.module_4.simplest_classes_and_objects.task05;

import java.util.Scanner;

/* 
 * Задача 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое 
 * значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию 
 * и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее 
 * получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class Main {

    public static void main(String[] args) {
	Counter counter = new Counter(0, 10, 0);

	showControlPanel();

	while (true) {
	    initAction(counter);
	    System.out.println();
	}
    }

    private static void showControlPanel() {
	System.out.println("Панель управления:");
	System.out.println("1 - показать значение счетчика");
	System.out.println("2 - увеличить значение счетчика");
	System.out.println("3 - уменьшить значение счетчика");
	System.out.println("4 - сбросить значение счетчика");
	System.out.println("0 - завершить программу");
	System.out.println();
    }

    private static void initAction(Counter counter) {
	switch (inputNumber("Введите число: ")) {
	case 1 -> System.out.println("Текущее состояние счетчика: " + counter.getCounterValue());
	case 2 -> {
	    System.out.println("Значение счетчика увеличено на 1");
	    counter.increaseValue();
	}
	case 3 -> {
	    System.out.println("Значение счетчика уменьшено на 1");
	    counter.decreaseValue();
	}
	case 4 -> {
	    System.out.println("Счетчик сброшен");
	    counter.dropCounter();
	}
	case 0 -> {
	    System.out.println("Программа завершена!");
	    System.exit(0);
	}
	}
    }

    private static int inputNumber(String message) {
	@SuppressWarnings("resource")
	Scanner console = new Scanner(System.in);

	int number;
	do {
	    System.out.print(message);
	    while (!console.hasNextInt()) {
		System.out.print(message);
		console.next();
	    }
	    number = Integer.parseInt(console.next());
	} while ((number < 0) || (number > 4));

	return number;
    }
}