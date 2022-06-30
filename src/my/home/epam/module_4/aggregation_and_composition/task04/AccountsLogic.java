package my.home.epam.module_4.aggregation_and_composition.task04;

/*
 * Задача 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем 
 * счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class AccountsLogic {
    private ClientsDatabase clientsDatabase = new ClientsDatabase();

    public Client getClient() {
	return clientsDatabase.getClient();
    }

    public void sortAllAccountsByBalanceAsc(Account[] accounts) {
	for (int i = 0; i < accounts.length - 1; i++) {
	    for (int j = i + 1; j < accounts.length; j++) {
		if (accounts[i].getBalance() > accounts[j].getBalance()) {
		    Account temp = accounts[i];
		    accounts[i] = accounts[j];
		    accounts[j] = temp;
		}
	    }
	}
    }

    public void sortAllAccountsByBalanceDesc(Account[] accounts) {
	for (int i = 0; i < accounts.length - 1; i++) {
	    for (int j = i + 1; j < accounts.length; j++) {
		if (accounts[i].getBalance() < accounts[j].getBalance()) {
		    Account temp = accounts[i];
		    accounts[i] = accounts[j];
		    accounts[j] = temp;
		}
	    }
	}
    }

    public double calculateAllAccountsBalance(Account[] accounts) {
	double totalBalance = 0;
	for (Account account : accounts) {
	    totalBalance += account.getBalance();
	}
	return totalBalance;
    }

    public double calculateAllAccountsWithPosBalance(Account[] accounts) {
	double posBalance = 0;
	for (Account account : accounts) {
	    if (account.getBalance() >= 0) {
		posBalance += account.getBalance();
	    }
	}
	return posBalance;
    }

    public double calculateAllAccountsWithNegBalance(Account[] accounts) {
	double negBalance = 0;
	for (Account account : accounts) {
	    if (account.getBalance() < 0) {
		negBalance += account.getBalance();
	    }
	}
	return negBalance;
    }

    public double calculateUnblockedAccountsBalance(Account[] accounts) {
	double totalBalance = 0;
	for (Account account : accounts) {
	    if (!account.isBlocked()) {
		totalBalance += account.getBalance();
	    }
	}
	return totalBalance;
    }

    public double calculateUnblockedAccountsWithPosBalance(Account[] accounts) {
	double posBalance = 0;
	for (Account account : accounts) {
	    if ((!account.isBlocked()) && (account.getBalance() >= 0)) {
		posBalance += account.getBalance();
	    }
	}
	return posBalance;
    }

    public double calculateUnblockedAccountsWithNegBalance(Account[] accounts) {
	double negBalance = 0;
	for (Account account : accounts) {
	    if ((!account.isBlocked()) && (account.getBalance() < 0)) {
		negBalance += account.getBalance();
	    }
	}
	return negBalance;
    }

    public void blockAccount(Client client, String accountNoToDelete) {
	int count = 0;
	for (Account account : client.getAccounts()) {
	    if (account.getAccountNo().compareTo(accountNoToDelete) == 0) {
		if (account.isBlocked()) {
		    System.out.println("Счет уже заблокирован!");
		} else {
		    account.setBlocked(true);
		    System.out.println("Счет успешно заблокирован!");
		}
		count++;
	    }
	}

	if (count == 0) {
	    System.out.println("Счет не найден!");
	}
    }

    public void unblockAccount(Client client, String accountNoToDelete) {
	int count = 0;
	for (Account account : client.getAccounts()) {
	    if (account.getAccountNo().compareTo(accountNoToDelete) == 0) {
		if (!account.isBlocked()) {
		    System.out.println("Счет не заблокирован!");
		} else {
		    account.setBlocked(false);
		    System.out.println("Счет успешно разблокирован!");
		}
		count++;
	    }
	}

	if (count == 0) {
	    System.out.println("Счет не найден!");
	}
    }
}