package classes.simplest_classes_and_objects.task08;

import java.util.ArrayList;
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

public class CustomersDatabase {
    private static List<Customer> customersDatabase = new ArrayList<Customer>();

    static {
	customersDatabase.add(new Customer(22222222, "Smith", "Baker Street", "1111_2222_3333_4444_0000", "234567890123456"));
	customersDatabase.add(new Customer(55555555, "Katherine", "Main Street", "0000_1111_2222_3333_4444", "567890123456789"));
	customersDatabase.add(new Customer(33333333, "Ashley", "White Street", "2222_3333_4444_0000_1111", "345678901234567"));
	customersDatabase.add(new Customer(11111111, "John", "Wall Street", "4444_0000_1111_2222_3333", "123456789012345"));
	customersDatabase.add(new Customer(44444444, "Victoria", "Black Street", "3333_4444_0000_1111_2222", "456789012345678"));
    }

    public List<Customer> getCustomersDatabase() {
	return customersDatabase;
    }
}