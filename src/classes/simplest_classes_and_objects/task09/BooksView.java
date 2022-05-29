package classes.simplest_classes_and_objects.task09;

import java.util.ArrayList;
import java.util.List;

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

public class BooksView {
    private BooksLogic bookLogic = new BooksLogic();

    public void printBook(Book book) {
	System.out.println(book.toString());
    }

    public void printAllBooks(List<Book> books) {
	for (Book book : books) {
	    printBook(book);
	}
    }

    public void printBooksByAuthor(List<Book> books) {
	List<Book> booksFound = new ArrayList<Book>();

	String author = bookLogic.inputAuthorOrPublisher("Укажите автора: ");
	int count = 0;

	for (Book book : books) {
	    if (book.getAuthors().equals(author)) {
		booksFound.add(book);
		count++;
	    }
	}

	if (count == 0) {
	    System.out.println("Книг указанного автора не найдено!");
	} else {
	    System.out.println("\nCписок книг заданного автора:");
	    printAllBooks(booksFound);
	}
    }

    public void printBooksByPublisher(List<Book> books) {
	List<Book> booksFound = new ArrayList<Book>();

	String publisher = bookLogic.inputAuthorOrPublisher("Укажите издательство: ");
	int count = 0;

	for (Book book : books) {
	    if (book.getPublisher().equals(publisher)) {
		booksFound.add(book);
		count++;
	    }
	}

	if (count == 0) {
	    System.out.println("Книг, выпущенных указанным издательством, не найдено!");
	} else {
	    System.out.println("\nCписок книг, выпущенных заданным издательством:");
	    printAllBooks(booksFound);
	}
    }

    public void printBooksAfterYear(List<Book> books) {
	List<Book> booksFound = new ArrayList<Book>();

	int year = bookLogic.inputYear("Укажите год: ");
	int count = 0;

	for (Book book : books) {
	    if (book.getYearPublished() > year) {
		booksFound.add(book);
		count++;
	    }
	}

	if (count == 0) {
	    System.out.println("Книг, выпущенных после указанного года, не найдено!");
	} else {
	    System.out.println("\nCписок книг, выпущенных после заданного года:");
	    printAllBooks(booksFound);
	}
    }
}