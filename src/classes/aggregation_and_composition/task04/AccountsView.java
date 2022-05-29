package classes.aggregation_and_composition.task04;

/*
 * Задача 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем 
 * счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class AccountsView {
    private static AccountsLogic accountLogic = new AccountsLogic();

    public void printAllAccounts(String message, Client client) {
	System.out.println(message);
	for (Account account : client.getAccounts()) {
	    System.out.println(account.toString());
	}
    }

    public void printAllAccountsByBalanceAsc(String message, Client client) {
	accountLogic.sortAllAccountsByBalanceAsc(client.getAccounts());
	printAllAccounts(message, client);
    }

    public void printAllAccountsByBalanceDesc(String message, Client client) {
	accountLogic.sortAllAccountsByBalanceDesc(client.getAccounts());
	printAllAccounts(message, client);
    }

    public void printAllAccountsBalance(String message, Client client) {
	System.out.println(message + "$" + accountLogic.calculateAllAccountsBalance(client.getAccounts()));
    }

    public void printAllAccountsWithPosBalance(String message, Client client) {
	System.out.println(message + "$" + accountLogic.calculateAllAccountsWithPosBalance(client.getAccounts()));
    }

    public void printAllAccountsWithNegBalance(String message, Client client) {
	System.out.println(message + "$" + accountLogic.calculateAllAccountsWithNegBalance(client.getAccounts()));
    }

    public void printUnblockedAccountsBalance(String message, Client client) {
	System.out.println(message + "$" + accountLogic.calculateUnblockedAccountsBalance(client.getAccounts()));
    }

    public void printUnblockedAccountsWithPosBalance(String message, Client client) {
	System.out.println(message + "$" + accountLogic.calculateUnblockedAccountsWithPosBalance(client.getAccounts()));
    }

    public void printUnblockedAccountsWithNegBalance(String message, Client client) {
	System.out.println(message + "$" + accountLogic.calculateUnblockedAccountsWithNegBalance(client.getAccounts()));
    }
}