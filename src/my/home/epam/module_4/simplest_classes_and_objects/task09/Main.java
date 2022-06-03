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

public class Main {

    public static void main(String[] args) {
	BooksLogic booksLogic = new BooksLogic();
	BooksView booksView = new BooksView();

	List<Book> books = booksLogic.getBooksDatabase();

	printActions();

	while (true) {
	    initActions(books, booksView);
	    System.out.println();
	}
    }

    private static void printActions() {
	System.out.println("Панель управления:");
	System.out.println("1. Показать список всех книг");
	System.out.println("2. Показать список книг заданного автора");
	System.out.println("3. Показать список книг, выпущенных заданным издательством");
	System.out.println("4. Показать список книг, выпущенных после заданного года");
	System.out.println("0. Завершить работу программы");
	System.out.println();
    }

    private static void initActions(List<Book> books, BooksView booksView) {
	switch (console("Введите число: ")) {
	case 1 -> booksView.printAllBooks(books);
	case 2 -> booksView.printBooksByAuthor(books);
	case 3 -> booksView.printBooksByPublisher(books);
	case 4 -> booksView.printBooksAfterYear((books));
	case 0 -> {
	    System.out.println("Работы программы завершена!");
	    System.exit(0);
	}
	}
    }

    private static int console(String message) {
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