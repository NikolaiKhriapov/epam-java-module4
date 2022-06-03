package my.home.epam.module_4.simplest_classes_and_objects.task09;

import java.util.List;
import java.util.Scanner;

/*
 * 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
 * метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * 
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

public class BooksLogic {
    private static BooksDatabase shelfDatabase = new BooksDatabase();
    
    public List<Book> getBooksDatabase() {
	return shelfDatabase.getBooksDatabase();
    }
    
    @SuppressWarnings("resource")
    public String inputAuthorOrPublisher(String message) {
	while (true) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print(message);
	    while (!scanner.hasNextLine()) {
		System.out.print(message);
		scanner.next();
	    }

	    return scanner.nextLine();
	}
    }
    
    @SuppressWarnings("resource")
    public int inputYear(String message) {
	while (true) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print(message);
	    while (!scanner.hasNextInt()) {
		System.out.print(message);
		scanner.next();
	    }

	    return scanner.nextInt();
	}
    }
}