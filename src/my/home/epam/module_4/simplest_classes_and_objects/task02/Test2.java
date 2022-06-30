package my.home.epam.module_4.simplest_classes_and_objects.task02;

/*
 * Задача 2. Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. 
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы 
 * для полей экземпляра класса.
 */

public class Test2 {
    private int a;
    private int b;

    public Test2(int a, int b) {
	super();
	this.a = a;
	this.b = b;
    }

    public Test2() {
	a = 0;
	b = 0;
    }

    public int getA() {
	return a;
    }

    public void setA(int a) {
	this.a = a;
    }

    public int getB() {
	return b;
    }

    public void setB(int b) {
	this.b = b;
    }
}