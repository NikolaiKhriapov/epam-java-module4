package my.home.epam.module_4.simplest_classes_and_objects.task04;

/*
 * Задача 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по 
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте 
 * возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть 
 * упорядочены по времени отправления.
 */

public class Train {
    private int destinationPoint;
    private int trainNo;
    private long departureTime;

    public Train() {
    }

    public Train(int destinationPoint, int trainNo, long departureTime) {
	super();
	this.destinationPoint = destinationPoint;
	this.trainNo = trainNo;
	this.departureTime = departureTime;
    }

    public int getDestinationPoint() {
	return destinationPoint;
    }

    public void setDestinationPoint(int destinationPoint) {
	this.destinationPoint = destinationPoint;
    }

    public int getTrainNo() {
	return trainNo;
    }

    public void setTrainNo(int trainNo) {
	this.trainNo = trainNo;
    }

    public long getDepartureTime() {
	return departureTime;
    }

    public void setDepartureTime(long departureTime) {
	this.departureTime = departureTime;
    }
}