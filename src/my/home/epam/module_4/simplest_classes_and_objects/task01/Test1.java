package my.home.epam.module_4.simplest_classes_and_objects.task01;

/* 
 * Задача 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения 
 * этих переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который 
 * находит наибольшее значение из этих двух переменных.
 */

public class Test1 {
    private int a;
    private int b;

    public void print() {
	System.out.println("Переменная а = " + a);
	System.out.println("Переменная b = " + b);
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

    public int getSum() {
	return a + b;
    }

    public int getMax() {
	return Math.max(a, b);
    }
}