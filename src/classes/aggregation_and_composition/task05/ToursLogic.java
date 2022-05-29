package classes.aggregation_and_composition.task05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа 
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта, 
 * питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class ToursLogic {
    private static ToursDatabase toursDatabase = new ToursDatabase();

    public ToursLogic() {
	super();
    }

    public List<Tour> initAllTours() {
	List<Tour> tours = new ArrayList<Tour>();

	for (int i = 0; i < toursDatabase.getToursDatabase().size(); i++) {
	    tours.add(i, toursDatabase.getToursDatabase().get(i));
	}

	int typeOfMeals = inputTypeOfMeals(tours);
	int numberOfDays = inputNumberOfDays(tours);

	System.out.println();

	calculateToursPrice(tours, typeOfMeals, numberOfDays);

	return tours;
    }

    public void initAllTours(List<Tour> tours) {
	tours.clear();
	for (int i = 0; i < toursDatabase.getToursDatabase().size(); i++) {
	    tours.add(i, toursDatabase.getToursDatabase().get(i));
	}
    }

    public int inputNumber(String message) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);

	System.out.print(message);
	while (!scanner.hasNextInt()) {
	    System.out.print(message);
	    scanner.next();
	}
	return scanner.nextInt();
    }

    public int inputTypeOfMeals(List<Tour> tours) {
	int typeOfMeals;
	do {
	    typeOfMeals = inputNumber("Введите тип питания (1 - все включено, 2 - трехразовое, 3 - завтрак, 4 - без питания): ");
	} while ((typeOfMeals < 1) || (typeOfMeals > 4));

	return typeOfMeals;
    }

    public int inputNumberOfDays(List<Tour> tours) {
	int numberOfDays;
	do {
	    numberOfDays = inputNumber("Введите количество дней (от 3 до 30): ");
	} while ((numberOfDays < 3) || (numberOfDays > 30));

	return numberOfDays;
    }

    public void calculateToursPrice(List<Tour> tours, int typeOfMeals, int numberOfDays) {
	// добавляем стоимость самой путевки в зависимости от типа путевки (без учета
	// транспорта и услуг туроператора)
	for (Tour tour : tours) {
	    switch (tour.getType()) {
	    case "отдых" -> tour.setPrice(String.valueOf((Integer.parseInt(tour.getPrice()) + (5_000 * numberOfDays))));
	    case "экскурсии" -> tour.setPrice(String.valueOf((Integer.parseInt(tour.getPrice()) + (10_000 * numberOfDays))));
	    case "лечение" -> tour.setPrice(String.valueOf((Integer.parseInt(tour.getPrice()) + (3_000 * numberOfDays))));
	    case "шопинг" -> tour.setPrice(String.valueOf((Integer.parseInt(tour.getPrice()) + (0_000 * numberOfDays))));
	    case "круиз" -> tour.setPrice(String.valueOf((Integer.parseInt(tour.getPrice()) + (15_000 * numberOfDays))));
	    }
	}
	// добавляем в стоимость путевки стоимость питания
	for (Tour tour : tours) {
	    switch (typeOfMeals) {
	    case 1 -> tour.setPrice(String.valueOf((Integer.parseInt(tour.getPrice()) + (8_000 * numberOfDays))));
	    case 2 -> tour.setPrice(String.valueOf((Integer.parseInt(tour.getPrice()) + (6_000 * numberOfDays))));
	    case 3 -> tour.setPrice(String.valueOf((Integer.parseInt(tour.getPrice()) + (2_000 * numberOfDays))));
	    case 4 -> tour.setPrice(String.valueOf((Integer.parseInt(tour.getPrice()) + (0_000 * numberOfDays))));
	    }
	}
    }

    public void sortToursByCountry(List<Tour> tours) {
	for (int i = 0; i < tours.size() - 1; i++) {
	    for (int j = i + 1; j < tours.size(); j++) {
		if (tours.get(i).getCountry().compareTo(tours.get(j).getCountry()) > 0) {
		    Tour temp = tours.get(i);
		    tours.set(i, tours.get(j));
		    tours.set(j, temp);
		}
	    }
	}
    }

    public void sortToursByPriceAsc(List<Tour> tours) {
	for (int i = 0; i < tours.size() - 1; i++) {
	    for (int j = i + 1; j < tours.size(); j++) {
		if (tours.get(i).getPrice().compareTo(tours.get(j).getPrice()) > 0) {
		    Tour temp = tours.get(i);
		    tours.set(i, tours.get(j));
		    tours.set(j, temp);
		}
	    }
	}
    }

    public void sortToursByPriceDesc(List<Tour> tours) {
	for (int i = 0; i < tours.size() - 1; i++) {
	    for (int j = i + 1; j < tours.size(); j++) {
		if (tours.get(i).getPrice().compareTo(tours.get(j).getPrice()) < 0) {
		    Tour temp = tours.get(i);
		    tours.set(i, tours.get(j));
		    tours.set(j, temp);
		}
	    }
	}
    }

    public Tour findTourByTourNumber(List<Tour> tours, int tourNumber) {
	// восстанавливаем список путевок
	initAllTours(tours);
	
	// находим нужную путевку
	Tour tourFound = null;

	for (Tour tour : tours) {
	    if (tour.getNumber() == tourNumber) {
		tourFound = tour;
	    }
	}

	return tourFound;
    }
}