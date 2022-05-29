package classes.aggregation_and_composition.task04;

/*
 * Задача 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем 
 * счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Client {
    private String name;
    private Account[] accounts;

    public Client() {
	super();
    }

    public Client(String name, Account[] accounts) {
	super();
	this.name = name;
	this.accounts = accounts;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Account[] getAccounts() {
	return accounts;
    }

    public void setAccounts(Account[] accounts) {
	this.accounts = accounts;
    }
}