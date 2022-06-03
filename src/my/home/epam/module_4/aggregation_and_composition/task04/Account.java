package my.home.epam.module_4.aggregation_and_composition.task04;

/*
 * Задача 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем 
 * счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Account {
    private String accountNo;
    private double balance;
    private boolean isBlocked;

    public Account() {
	super();
    }

    public Account(String accountNo, double balance, boolean isBlocked) {
	super();
	this.accountNo = accountNo;
	this.balance = balance;
	this.isBlocked = isBlocked;
    }

    public String getAccountNo() {
	return accountNo;
    }

    public void setAccountNo(String accountNo) {
	this.accountNo = accountNo;
    }

    public double getBalance() {
	return balance;
    }

    public void setBalance(double balance) {
	this.balance = balance;
    }

    public boolean isBlocked() {
	return isBlocked;
    }

    public void setBlocked(boolean isBlocked) {
	this.isBlocked = isBlocked;
    }

    @Override
    public String toString() {
	return "Счет № " + accountNo + ", баланс: $" + balance + (isBlocked ? ", счет заблокирован" : "");
    }
}