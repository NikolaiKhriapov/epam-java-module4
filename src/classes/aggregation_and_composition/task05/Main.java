package classes.aggregation_and_composition.task05;

import java.util.List;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа 
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта, 
 * питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {

    public static void main(String[] args) {
	ActionsLogic actionsLogic = new ActionsLogic();
	ToursLogic toursLogic = new ToursLogic();

	List<Tour> tours = toursLogic.initAllTours();

	printActions();

	while (true) {
	    initActions(tours, actionsLogic, toursLogic);
	    System.out.println();
	}
    }

    private static void printActions() {
	System.out.println("Панель управления: ");
	System.out.println("1. Показать весь список путевок");
	System.out.println("2. Подобрать путевки определенного типа (отдых, экскурсии, лечение, шопинг, круиз)");
	System.out.println("3. Отсортировать путевки по стране, по стоимости");
	System.out.println("4. Приобрести путевку");
	System.out.println("0. Завершить работу программы");
	System.out.println();
    }

    private static void initActions(List<Tour> tours, ActionsLogic actionsLogic, ToursLogic toursLogic) {
	switch (toursLogic.inputNumber("Введите число: ")) {
	case 1 -> actionsLogic.showAllTours(tours);
	case 2 -> actionsLogic.showToursByType(tours);
	case 3 -> actionsLogic.sortTours(tours);
	case 4 -> actionsLogic.buyTour(tours);
	case 0 -> actionsLogic.terminateProgram();
	}
    }
}