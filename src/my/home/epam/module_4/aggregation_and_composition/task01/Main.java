package my.home.epam.module_4.aggregation_and_composition.task01;

import java.util.Scanner;

/*
 * Задача 1. Создать объект класса Текст, используя классы Предложение, Слово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Main {
    public static void main(String[] args) {
	TextLogic textLogic = new TextLogic();

	Text text = textLogic.initText();

	printActions();

	while (true) {
	    initActions(text, textLogic);
	    System.out.println();
	}
    }

    private static void printActions() {
	System.out.println("Панель управления:");
	System.out.println("1. Вывести на консоль текст");
	System.out.println("2. Дополнить текст");
	System.out.println("0. Завершить работу с текстом");
	System.out.println();
    }

    private static void initActions(Text text, TextLogic textLogic) {
	switch (inputNumber("Введите число: ")) {
	case 1 -> {
	    System.out.println();
	    textLogic.printText(text);
	    System.out.println();
	}
	case 2 -> textLogic.addSentence(text);
	case 0 -> {
	    System.out.println("Работа с текстом завершена!");
	    System.exit(0);
	}
	}
    }

    private static int inputNumber(String message) {
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