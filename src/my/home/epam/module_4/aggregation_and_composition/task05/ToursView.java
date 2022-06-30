package my.home.epam.module_4.aggregation_and_composition.task05;

import java.util.List;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа 
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта, 
 * питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class ToursView {
    private static ToursLogic toursLogic = new ToursLogic();

    public void showTours(List<Tour> tours, String message) {
	System.out.println(message);

	int count = 0;
	for (Tour tour : tours) {
	    System.out.println(tour.toString());
	    count++;
	}

	if (count == 0) {
	    System.out.println("Путевок не найдено!");
	}
    }

    public void showAllTours(List<Tour> tours, String message) {
	toursLogic.initAllTours(tours);
	showTours(tours, message);
    }

    public void showToursByType(List<Tour> tours, int type) {
	String typeToBeFound = "";

	switch (type) {
	case 1 -> typeToBeFound = "отдых";
	case 2 -> typeToBeFound = "экскурсии";
	case 3 -> typeToBeFound = "лечение";
	case 4 -> typeToBeFound = "шопинг";
	case 5 -> typeToBeFound = "круиз";
	default -> System.out.println("Ошибка! Тип путевки не найден!");
	}

	for (int i = 0; i < tours.size(); i++) {
	    if (!tours.get(i).getType().equals(typeToBeFound)) {
		tours.remove(tours.get(i));
		i--;
	    }
	}

	showTours(tours, "");
    }

    public void showSortedTours(List<Tour> tours, int type) {
	String message = "";
	switch (type) {
	case 1 -> {
	    toursLogic.sortToursByCountry(tours);
	}
	case 2 -> {
	    toursLogic.sortToursByPriceAsc(tours);
	}
	case 3 -> {
	    toursLogic.sortToursByPriceDesc(tours);
	}
	}

	showTours(tours, message);
    }

    public void showToursWithPrices(List<Tour> tours, int typeOfMeals, int numberOfDays, String message) {
	toursLogic.calculateToursPrice(tours, typeOfMeals, numberOfDays);

	System.out.println(message);

	int count = 0;
	for (int i = 0; i < tours.size(); i++) {
	    System.out.println(tours.get(i).toString());
	    count++;
	}

	if (count == 0) {
	    System.out.println("Путевок не найдено!");
	}
    }

    public String showTourByTourNumber(List<Tour> tours, int tourNumber) {
	String message = "";

	int count = 0;
	for (Tour tour : tours) {
	    if (tour.getNumber() == tourNumber) {
		message = tour.toString();
		count++;
	    }
	}

	if (count == 0) {
	    message = "\nПутевок не найдено!\n";
	}

	return message;
    }
}