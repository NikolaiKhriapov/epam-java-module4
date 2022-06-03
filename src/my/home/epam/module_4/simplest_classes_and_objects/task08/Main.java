package my.home.epam.module_4.simplest_classes_and_objects.task08;

import java.util.List;
import java.util.Scanner;

/*
 * Задача 8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, 
 * set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer, 
 * с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * 
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Main {

    public static void main(String[] args) {
	CustomerLogic customerLogic = new CustomerLogic();
	CustomerView customerView = new CustomerView();

	List<Customer> customers = customerLogic.initCustomers();

	printActions();

	while (true) {
	    initActions(customers, customerLogic, customerView);
	    System.out.println();
	}
    }

    private static void printActions() {
	System.out.println("Панель управления:");
	System.out.println("1. Показать список всех клиентов");
	System.out.println("2. Отсортировать клиентов по имени");
	System.out.println("3. Показать список клиентов, у которых номер кредитной карточки находится в заданном интервале");
	System.out.println("0. Завершить работу программы");
	System.out.println();
    }

    private static void initActions(List<Customer> customers, CustomerLogic customerLogic, CustomerView customerView) {
	switch (console("Введите число: ")) {
	case 1 -> customerView.print("Список клиентов:", customers);
	case 2 -> {
	    customerLogic.sortByName(customers);
	    System.out.println("Список клиентов отсортирован по имени");
	}
	case 3 -> customerView.printByCreditCard("Список всех клиентов, у которых номер кредитной карточки находится в заданном интервале", customers);
	case 0 -> {
	    System.out.println("Работа программы завершена!");
	    System.exit(0);
	}
	default -> console("Введите число: ");
	}
    }

    private static int console(String message) {
	@SuppressWarnings("resource")
	Scanner console = new Scanner(System.in);

	System.out.print(message);
	while (!console.hasNextInt()) {
	    System.out.print(message);
	    console.next();
	}

	return console.nextInt();
    }
}