package my.home.epam.module_4.simplest_classes_and_objects.task08;

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

public class Customer {
    private int id;
    private String name;
    private String address;
    private String creditCardNumber;
    private String bankAccountNumber;

    public Customer() {
	super();
    }

    public Customer(int id, String name, String address, String creditCardNumber, String bankAccountNumber) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.creditCardNumber = creditCardNumber;
	this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public String getCreditCardNumber() {
	return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
	this.creditCardNumber = creditCardNumber;
    }

    public String getBankAccountNumber() {
	return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
	this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
	return "Клиент [id: " + id + ", Ф.И.О.: " + name + ", адрес: " + address + ", номер кредитной карточки: " + creditCardNumber + ", номер банковского счета: "
		+ bankAccountNumber + "]";
    }
}