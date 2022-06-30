package my.home.epam.module_4.aggregation_and_composition.task04;

/*
 * Задача 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем 
 * счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class ClientsDatabase {
    private static String name = "Иванов И.И.";

    private static Account account1 = new Account("0011_2233_4455_6677_8899", 5_000, false);
    private static Account account2 = new Account("1122_3344_5566_7788_9900", 3_500, false);
    private static Account account3 = new Account("2233_4455_6677_8899_0011", -400, false);
    private static Account account4 = new Account("3344_5566_7788_9900_1122", -6_000, false);
    private static Account account5 = new Account("4455_6677_8899_0011_2233", 900, true);
    private static Account account6 = new Account("5566_7788_9900_1122_3344", -700, true);

    private static Client client = new Client(name, new Account[] { account1, account2, account3, account4, account5, account6 });

    public Client getClient() {
	return client;
    }
}