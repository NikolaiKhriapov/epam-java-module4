package my.home.epam.module_4.simplest_classes_and_objects.task04;

import java.sql.Time;

/*
 * Задача 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по 
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте 
 * возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть 
 * упорядочены по времени отправления.
 */

public class TrainsView {
    private TrainsLogic trainsLogic = new TrainsLogic();

    public void printTrainInfo(Train train) {
	System.out.println("Номер поезда: " + (train.getTrainNo()) + ", пункт назначения: " + train.getDestinationPoint() 
		+ ", время отправления: " + new Time(train.getDepartureTime()));
    }

    public void printTrainByNumber(Train[] trains, String message) {
	int trainNumber = trainsLogic.inputTrainNumber("Введите номер поезда: ");
	Train trainFound = trainsLogic.findTrainByNumber(trains, trainNumber);

	printTrainInfo(trainFound);
    }

    public void printAllTrains(Train[] trains) {
	for (Train train : trains) {
	    printTrainInfo(train);
	}
    }
}