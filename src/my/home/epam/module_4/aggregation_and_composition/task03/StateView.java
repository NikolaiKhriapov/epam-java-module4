package my.home.epam.module_4.aggregation_and_composition.task03;

/*
 * Задача 3. Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class StateView {

    public void printCapitalCity(State state) {
	for (Region region : state.getRegions()) {
	    for (District district : region.getDistricts()) {
		if (district.getCity().isCapitalCity()) {
		    System.out.println("Столица: " + district.getCity().getName());
		}
	    }
	}
    }

    public void printNoOfRegions(State state) {
	int count = 0;
	for (int i = 0; i < state.getRegions().length; i++) {
	    count++;
	}
	System.out.println("Областей: " + count);
    }

    public void printStateArea(State state) {
	double stateArea = 0;
	for (Region region : state.getRegions()) {
	    stateArea += region.getArea();
	}
	System.out.println("Площадь: " + stateArea + " км2");
    }

    public void printRegionalCenters(State state) {
	// все областные центры, кроме областного центра последней области
	System.out.print("Областные центры: ");
	for (int i = 0; i < state.getRegions().length - 1; i++) {
	    for (District district : state.getRegions()[i].getDistricts()) {
		if (district.getCity().isRegionalCenter()) {
		    System.out.print(district.getCity().getName() + ", ");
		}
	    }
	}
	// областной центр последней области
	for (District district : state.getRegions()[state.getRegions().length - 1].getDistricts())
	    if (district.getCity().isRegionalCenter()) {
		System.out.print(district.getCity().getName());
	    }
	System.out.println();
    }
}