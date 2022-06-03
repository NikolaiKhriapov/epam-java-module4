package my.home.epam.module_4.simplest_classes_and_objects.task08;

import java.util.List;

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

public class CustomerView {
    private static CustomerLogic customerLogic = new CustomerLogic();

    public void print(String message, List<Customer> customers) {
	System.out.println(message);
	for (int i = 0; i < customers.size(); i++) {
	    System.out.println(customers.get(i).toString());
	}
    }

    public void printByCreditCard(String message, List<Customer> customers) {
	System.out.println(message);
	String from = customerLogic.inputCreditCardNumber("От ");
	String to = customerLogic.inputCreditCardNumber("До ");

	for (int i = 0; i < customers.size(); i++) {
	    if (customerLogic.isCreditCardNumberOk(customers.get(i), from, to) == true) {
		System.out.println(customers.get(i).toString());
	    }
	}
    }
}