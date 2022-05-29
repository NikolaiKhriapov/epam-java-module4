package classes.aggregation_and_composition.task02;

/*
 * Задача 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class CarLogic {

    public void driveCar(Car car) {
	System.out.println("Машина едет.");
    }

    public void refuelCar(Car car) {
	System.out.println("Машина заправлена.");
    }

    public void replaceWheel(Car car) {
	System.out.println("Колесо заменено.");
    }
}