package my.home.epam.module_4.simplest_classes_and_objects.task10;

/*
 * Задача 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
 * и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * 
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class AirlinesDatabase {
    private static Airport airlinesDatabase = new Airport();

    static {
	airlinesDatabase.getAirlines().add(new Airline("Пекин", "BJ-1109", "Airbus A320", "18:30", new String[] { "Понедельник", "Воскресенье" }));
	airlinesDatabase.getAirlines().add(new Airline("Пекин", "BJ-5516", "Boeing-777", "08:00", new String[] { "Понедельник", "Суббота" }));
	airlinesDatabase.getAirlines().add(new Airline("Токио", "TK-4988", "Airbus A330", "09:45", new String[] { "Вторник", "Четверг" }));
	airlinesDatabase.getAirlines().add(new Airline("Токио", "TK-2244", "Boeing-777", "12:15", new String[] { "Понедельник", "Пятница" }));
	airlinesDatabase.getAirlines().add(new Airline("Гонконг", "GK-7123", "Boeing-777", "10:30", new String[] { "Среда", "Суббота" }));
	airlinesDatabase.getAirlines().add(new Airline("Гонконг", "GK-5976", "Boeing-777", "16:00", new String[] { "Четверг", "Воскресенье" }));
	airlinesDatabase.getAirlines().add(new Airline("Бангкок", "BK-6468", "Airbus A320", "11:00", new String[] { "Вторник", "Пятница" }));
	airlinesDatabase.getAirlines().add(new Airline("Бангкок", "BK-7669", "Airbus A320", "14:45", new String[] { "Среда", "Четверг" }));
	airlinesDatabase.getAirlines().add(new Airline("Сидней", "SN-3885", "Airbus A330", "19:15", new String[] { "Среда", "Воскресенье" }));
	airlinesDatabase.getAirlines().add(new Airline("Сидней", "SN-7766", "Airbus A330", "16:15", new String[] { "Вторник", "Пятница" }));
    }

    public Airport getAirlinesDatabase() {
	return airlinesDatabase;
    }
}