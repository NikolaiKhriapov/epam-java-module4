package my.home.epam.module_4.simplest_classes_and_objects.task06;

import java.util.Scanner;

/*
 * Задача 6. Составьте описание класса для представления времени. Предусмотрите возможности установки 
 * времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых 
 * значений. В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы 
 * изменения времени на заданное количество часов, минут и секунд.
 */

public class Main {

    public static void main(String[] args) {
	MyTime time = new MyTime();

	printActions();
	while (true) {
	    initActions(time);
	    System.out.println();
	}
    }

    private static void printActions() {
	System.out.println("Панель управления:");
	System.out.println("1. Вывести время на консоль");
	System.out.println("2. Установить время");
	System.out.println("3. Установить часы");
	System.out.println("4. Установить минуты");
	System.out.println("5. Установить секунды");
	System.out.println("6. Изменить время на заданное количество часов");
	System.out.println("7. Изменить время на заданное количество минут");
	System.out.println("8. Изменить время на заданное количество секунд");
	System.out.println("0. Завершить работу программы");
	System.out.println();
    }

    private static void initActions(MyTime time) {
	switch (console("Введите число: ")) {
	case 1 -> printTime(time);
	case 2 -> time.setTime(console("Установить текущее значение часов на "), console("Установить текущее значение часов на "), console("Установить текущее значение часов на "));
	case 3 -> time.setHrs(console("Установить текущее значение часов на "));
	case 4 -> time.setMins(console("Установить текущее значение минут на "));
	case 5 -> time.setSecs(console("Установить текущее значение секунд на "));
	case 6 -> time.changeHrs(console("Изменить время (часы) на: "));
	case 7 -> time.changeMins(console("Изменить время (минуты) на: "));
	case 8 -> time.changeSecs(console("Изменить время (секунды) на: "));
	case 0 -> {
	    System.out.print("Работа программы завершена!");
	    System.exit(0);
	}
	}
    }

    static int console(String message) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);

	System.out.print(message);
	while (!scanner.hasNextInt()) {
	    System.out.print(message);
	    scanner.next();
	}
	return scanner.nextInt();
    }

    private static void printTime(MyTime time) {
	System.out.printf("%02d:%02d:%02d", time.getHrs(), time.getMins(), time.getSecs());
	System.out.println();
    }
}