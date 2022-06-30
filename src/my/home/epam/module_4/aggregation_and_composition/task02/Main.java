package my.home.epam.module_4.aggregation_and_composition.task02;

import java.util.Scanner;

/*
 * Задача 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {

    public static void main(String[] args) {
	CarLogic carLogic = new CarLogic();
	CarView carView = new CarView();

	Car car = initCar();

	printActions(car);

	while (true) {
	    initActions(car, carLogic, carView);
	    System.out.println();
	}
    }

    private static Car initCar() {
	// двигатель
	Engine engine = new Engine("значение1", "значение2", "значение3", "значение4", "значение5");
	
	// колеса
	final int noOfWheels = 4;
	Wheel[] wheels = new Wheel[noOfWheels];

	String parameter1 = "значение1";
	String parameter2 = "значение2";
	String parameter3 = "значение3";
	String parameter4 = "значение4";
	String parameter5 = "значение5";

	for (int i = 0; i < wheels.length; i++) {
	    wheels[i] = new Wheel(parameter1, parameter2, parameter3, parameter4, parameter5);
	}

	return new Car("Tesla", "Model S", "красный", 322, 2009, engine, wheels);
    }

    private static void printActions(Car car) {
	System.out.println("Ваш автомобиль: " + car.toString());
	System.out.println();
	System.out.println("Панель управления:");
	System.out.println("1. Ехать");
	System.out.println("2. Заправиться");
	System.out.println("3. Поменять колесо");
	System.out.println("4. Вывести на консоль марку автомобиля");
	System.out.println("0. Завершить работу программы");
	System.out.println();
    }

    private static void initActions(Car car, CarLogic carLogic, CarView carView) {
	switch (console("Введите число: ")) {
	case 1 -> carLogic.driveCar(car);
	case 2 -> carLogic.refuelCar(car);
	case 3 -> carLogic.replaceWheel(car);
	case 4 -> carView.printCarBrand(car);
	case 0 -> {
	    System.out.print("Машина в гараже.");
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