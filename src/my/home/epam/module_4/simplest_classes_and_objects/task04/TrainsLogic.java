package my.home.epam.module_4.simplest_classes_and_objects.task04;

import java.util.Random;
import java.util.Scanner;

/*
 * Задача 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по 
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте 
 * возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть 
 * упорядочены по времени отправления.
 */

public class TrainsLogic {

    public Train[] initTrains() {
	final int noOfTrains = 5;
	Train[] trains = new Train[noOfTrains];

	for (int i = 0; i < trains.length; i++) {
	    int destinationPoint = new Random().nextInt(1, 3);
	    int trainNo = i + 1;
	    long departureTime = new Random().nextLong(-6 * 60 * 60 * 1000, 18 * 60 * 60 * 1000);

	    trains[i] = new Train(destinationPoint, trainNo, departureTime);
	}
	return trains;
    }

    public void sortTrainsByTrainNo(Train[] trains) {
	for (int i = 0; i < trains.length - 1; i++) {
	    for (int j = i + 1; j < trains.length; j++) {
		if (trains[i].getTrainNo() > trains[j].getTrainNo()) {
		    Train temp = trains[i];
		    trains[i] = trains[j];
		    trains[j] = temp;
		}
	    }
	}
    }

    public void sortTrainsByDestPoint(Train[] trains) {
	for (int i = 0; i < trains.length - 1; i++) {
	    for (int j = i + 1; j < trains.length; j++) {
		if (trains[i].getDestinationPoint() > trains[j].getDestinationPoint()) {
		    Train temp = trains[i];
		    trains[i] = trains[j];
		    trains[j] = temp;
		}

		if (trains[i].getDestinationPoint() == trains[j].getDestinationPoint()) {
		    if (trains[i].getDepartureTime() > trains[j].getDepartureTime()) {
			Train temp = trains[i];
			trains[i] = trains[j];
			trains[j] = temp;
		    }
		}
	    }
	}
    }

    public int inputTrainNumber(String message) {
	int trainNumber;

	do {
	    @SuppressWarnings("resource")
	    Scanner console = new Scanner(System.in);

	    System.out.print(message);
	    while (!console.hasNextInt()) {
		System.out.print(message);
		console.next();
	    }
	    trainNumber = Integer.parseInt(console.next());
	} while ((trainNumber < 1) && (trainNumber > 5));

	return trainNumber;
    }

    public Train findTrainByNumber(Train[] trains, int trainNumber) {
	Train trainFound = new Train();

	for (Train train : trains) {
	    if (train.getTrainNo() == trainNumber) {
		trainFound = train;
	    }
	}
	return trainFound;
    }
}