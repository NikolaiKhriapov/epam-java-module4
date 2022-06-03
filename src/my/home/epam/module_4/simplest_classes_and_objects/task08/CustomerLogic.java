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

public class CustomerLogic {
    private static CustomersDatabase customersDatabase = new CustomersDatabase();

    public List<Customer> initCustomers() {
	return customersDatabase.getCustomersDatabase();
    }

    public void sortByName(List<Customer> listOfCustomers) {
	for (int i = 0; i < listOfCustomers.size(); i++) {
	    for (int j = i + 1; j < listOfCustomers.size(); j++) {
		if (listOfCustomers.get(i).getName().compareTo(listOfCustomers.get(j).getName()) > 0) {
		    Customer temp = listOfCustomers.get(i);
		    listOfCustomers.set(i, listOfCustomers.get(j));
		    listOfCustomers.set(j, temp);
		}
	    }
	}
    }

    public boolean isCreditCardNumberOk(Customer customer, String from, String to) {

	if (!((customer.getCreditCardNumber().compareTo(from) > 0) && (customer.getCreditCardNumber().compareTo(to) < 0))) {
	    return false;
	}
	return true;
    }

    public String inputCreditCardNumber(String message) {
	String number;

	do {
	    @SuppressWarnings("resource")
	    Scanner console = new Scanner(System.in);

	    System.out.print(message);
	    while (!console.hasNextLine()) {
		System.out.print(message);
		console.next();
	    }
	    number = console.nextLine();
	} while (!((number.compareTo("10000000000000000000") > 0) || (number.compareTo("100000000000000000000") < 0)));

	return number;
    }
}