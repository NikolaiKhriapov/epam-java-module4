package my.home.epam.module_4.aggregation_and_composition.task05;

import java.util.ArrayList;
import java.util.List;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа 
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта, 
 * питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class ToursDatabase {

    private static List<Tour> toursDatabase = new ArrayList<Tour>();

    static {
	toursDatabase.add(new Tour(1, "Китай", "Пекин", "экскурсии", "самолет", "70000"));
	toursDatabase.add(new Tour(2, "Китай", "Шанхай", "шопинг", "самолет", "70000"));
	toursDatabase.add(new Tour(3, "Россия", "Севастополь", "круиз", "автобус", "25000"));
	toursDatabase.add(new Tour(4, "Россия", "Ялта", "лечение", "автобус", "25000"));
	toursDatabase.add(new Tour(5, "Беларусь", "Минск", "экскурсии", "автобус", "35000"));
	toursDatabase.add(new Tour(6, "Беларусь", "Брест", "отдых", "автобус", "35000"));
	toursDatabase.add(new Tour(7, "Казахстан", "Нур-Султан", "шопинг", "самолет", "30000"));
	toursDatabase.add(new Tour(8, "Казахстан", "Алмата", "экскурсии", "самолет", "30000"));
	toursDatabase.add(new Tour(9, "США", "Нью-Йорк", "шопинг", "самолет", "80000"));
	toursDatabase.add(new Tour(10, "США", "Аризона", "экскурсии", "самолет", "80000"));
	toursDatabase.add(new Tour(11, "Сингапур", "Сингапур", "шопинг", "самолет", "70000"));
	toursDatabase.add(new Tour(12, "Таиланд", "Бангкок", "отдых", "самолет", "40000"));
	toursDatabase.add(new Tour(13, "Таиланд", "Пхукет", "круиз", "самолет", "40000"));
	toursDatabase.add(new Tour(14, "Новая Зеландия", "Окленд", "отдых", "самолет", "65000"));
	toursDatabase.add(new Tour(15, "Новая Зеландия", "Крайстчерч", "экскурсии", "самолет", "65000"));
	toursDatabase.add(new Tour(16, "Франция", "Париж", "шопинг", "самолет", "60000"));
	toursDatabase.add(new Tour(17, "Франция", "Марсель", "экскурсии", "самолет", "60000"));
	toursDatabase.add(new Tour(18, "Италия", "Рим", "шопинг", "самолет", "60000"));
	toursDatabase.add(new Tour(19, "Италия", "Венеция", "экскурсии", "самолет", "60000"));
	toursDatabase.add(new Tour(20, "Турция", "Стамбул", "отдых", "самолет", "30000"));
	toursDatabase.add(new Tour(21, "Турция", "Анталия", "круиз", "самолет", "30000"));
	toursDatabase.add(new Tour(22, "Египет", "Шарм-эль-Шейх", "отдых", "самолет", "30000"));
	toursDatabase.add(new Tour(23, "Египет", "Хургада", "отдых", "самолет", "30000"));
	toursDatabase.add(new Tour(24, "Россия", "Санкт-Петербург", "лечение", "автобус", "20000"));
	toursDatabase.add(new Tour(25, "Россия", "Нижний Новгород", "экскурсии", "автобус", "20000"));
    }

    public List<Tour> getToursDatabase() {
	return toursDatabase;
    }
}