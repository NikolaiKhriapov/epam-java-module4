package classes.simplest_classes_and_objects.task09;

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

public class Book {
    private String id;
    private String name;
    private String authors;
    private String publisher;
    private int yearPublished;
    private int pages;
    private String price;
    private String bindingType;

    public Book() {
	super();
    }

    public Book(String id, String name, String authors, String publisher, int yearPublished, int pages, String price, String bindingType) {
	super();
	this.id = id;
	this.name = name;
	this.authors = authors;
	this.publisher = publisher;
	this.yearPublished = yearPublished;
	this.pages = pages;
	this.price = price;
	this.bindingType = bindingType;
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getAuthors() {
	return authors;
    }

    public void setAuthors(String authors) {
	this.authors = authors;
    }

    public String getPublisher() {
	return publisher;
    }

    public void setPublisher(String publisher) {
	this.publisher = publisher;
    }

    public int getYearPublished() {
	return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
	this.yearPublished = yearPublished;
    }

    public int getPages() {
	return pages;
    }

    public void setPages(int pages) {
	this.pages = pages;
    }

    public String getPrice() {
	return price;
    }

    public void setPrice(String price) {
	this.price = price;
    }

    public String getBindingType() {
	return bindingType;
    }

    public void setBindingType(String bindingType) {
	this.bindingType = bindingType;
    }

    @Override
    public String toString() {
	return "Книга " + id + ": \"" + name + "\", " + authors + ", " + publisher + ", " + yearPublished + ", " + pages + " стр., " + price + ", " + bindingType;
    }
}