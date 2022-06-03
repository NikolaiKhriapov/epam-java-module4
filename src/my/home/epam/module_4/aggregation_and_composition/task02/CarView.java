package my.home.epam.module_4.aggregation_and_composition.task02;

/*
 * Задача 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class CarView {

    public void printCarBrand(Car car) {
	System.out.println(car.getBrand());
    }
}