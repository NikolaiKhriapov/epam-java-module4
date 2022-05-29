package classes.simplest_classes_and_objects.task05;

/* 
 * Задача 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое 
 * значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию 
 * и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее 
 * получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class Counter {
    private int counterValue;
    private final int counterMin;
    private final int counterMax;

    public Counter(int counterMin, int counterMax, int counterValue) {
	super();
	this.counterMin = counterMin;
	this.counterMax = counterMax;
	this.counterValue = counterValue;

	if (counterMin > counterMax) {
	    System.out.println("Нижний диапазон счетчика не может быть выше верхнего диапазона!");
	    System.exit(0);
	} else if (counterMin == counterMax) {
	    System.out.println("Нижний диапазон счетчика не может быть равен верхнему диапазону!");
	    System.exit(0);
	}

	if ((counterValue < counterMin) || (counterValue > counterMax)) {
	    System.out.println("Значение счетчика не может выходить за пределы диапазона значений!");
	    System.exit(0);
	}
    }

    public Counter(int counterMin, int counterMax) {
	this(counterMin, counterMax, counterMin);
    }

    public int getCounterValue() {
	return counterValue;
    }

    public int increaseValue() {
	counterValue++;
	if (counterValue > counterMax) {
	    counterValue = counterMin;
	}
	return counterValue;
    }

    public int decreaseValue() {
	counterValue--;
	if (counterValue < counterMin) {
	    counterValue = counterMax;
	}
	return counterValue;
    }

    public void dropCounter() {
	counterValue = 0;
    }
}