package classes.aggregation_and_composition.task05;

import java.util.List;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа 
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта, 
 * питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class ActionsLogic {
    private static ToursLogic toursLogic = new ToursLogic();
    private static ToursView toursView = new ToursView();

    // 1. Показать весь список путевок
    public void showAllTours(List<Tour> tours) {
	toursView.showAllTours(tours, "\nСписок всех путевок: ");
    }

    // 2. Подобрать путевки определенного типа (отдых, экскурсии, лечение, шопинг,
    // круиз)
    public void showToursByType(List<Tour> tours) {
	toursLogic.initAllTours(tours);
	int typeOfTour;
	do {
	    typeOfTour = toursLogic.inputNumber("Введите тип путевки (1 - отдых, 2 - экскурсии, 3 - лечение, 4 - шопинг, 5 - круиз): ");
	} while ((typeOfTour < 1) || (typeOfTour > 5));
	toursView.showToursByType(tours, typeOfTour);
    }

    // 3. Отсортировать путевки по стране, по стоимости
    public void sortTours(List<Tour> tours) {
	int sort;
	do {
	    sort = toursLogic.inputNumber("Введите тип сортировки (1 - по стране, 2 - по стоимости (по возрастанию), 3 - по стоимости (по убыванию)): ");
	} while ((sort < 1) || (sort > 3));
	toursView.showSortedTours(tours, sort);
    }

    // 4. Приобрести путевку
    public void buyTour(List<Tour> tours) {
	int tourNumber;
	do {
	    tourNumber = toursLogic.inputNumber("Введите номер путевки: ");
	} while ((tourNumber < 0) || (tourNumber > 25));

	Tour tourFound = toursLogic.findTourByTourNumber(tours, tourNumber);

	System.out.println("\nПоздравляем! Вы выбрали путевку:");
	System.out.println(tourFound.toString());

	int persons;
	do {
	    persons = toursLogic.inputNumber("\nВведите количество человек (от 1 до 10): ");
	} while ((persons < 0) || (persons > 10));

	int price = Integer.parseInt(tourFound.getPrice()) * persons;
	System.out.println("К оплате: " + price + " руб.");
	System.exit(0);
    }

    // 0. Завершить работу программы
    public void terminateProgram() {
	System.out.println("Работа программы завершена.");
	System.exit(0);
    }
}