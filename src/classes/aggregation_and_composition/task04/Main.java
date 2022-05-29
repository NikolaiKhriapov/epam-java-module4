package classes.aggregation_and_composition.task04;

import java.util.Scanner;

/*
 * Задача 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем 
 * счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {

    public static void main(String[] args) {
	AccountsView accountView = new AccountsView();
	AccountsLogic accountLogic = new AccountsLogic();

	Client client = accountLogic.getClient();

	printActions();

	while (true) {
	    initActions(client, accountView, accountLogic);
	    System.out.println();
	}
    }

    private static void printActions() {
	System.out.println("Панель управления: ");
	System.out.println("1. Показать все счета клиента");
	System.out.println("2. Отсортировать все счета клиента по балансу (по возрастанию)");
	System.out.println("3. Отсортировать все счета клиента по балансу (по убыванию)");
	System.out.println("4. Показать общую сумму по всем счетам");
	System.out.println("5. Показать общую сумму по счетам, имеющим положительный баланс");
	System.out.println("6. Показать общую сумму по счетам, имеющим отрицательный баланс");
	System.out.println("7. Показать общую сумму по всем незаблокированным счетам");
	System.out.println("8. Показать общую сумму по незаблокированным счетам, имеющим положительный баланс");
	System.out.println("9. Показать общую сумму по незаблокированным счетам, имеющим отрицательный баланс");
	System.out.println("10. Заблокировать счет");
	System.out.println("11. Разблокировать счет");
	System.out.println("0. Завершить работу программы");
	System.out.println();
    }

    private static void initActions(Client client, AccountsView accountView, AccountsLogic accountLogic) {
	switch (inputActionNumber("Введите число: ")) {
	case 1 -> accountView.printAllAccounts("Все счета клиента (" + client.getName() + "):", client);
	case 2 -> accountView.printAllAccountsByBalanceAsc("Все счета клиента (" + client.getName() + "), отсортированные по балансу (по возрастанию)", client);
	case 3 -> accountView.printAllAccountsByBalanceDesc("Все счета клиента (" + client.getName() + "), отсортированные по балансу (по убыванию)", client);
	case 4 -> accountView.printAllAccountsBalance("Общая сумма по всем счетам: ", client);
	case 5 -> accountView.printAllAccountsWithPosBalance("Общая сумма по всем счетам, имеющим положительный баланс: ", client);
	case 6 -> accountView.printAllAccountsWithNegBalance("Общая сумма по всем счетам, имеющим отрицательный баланс: ", client);
	case 7 -> accountView.printUnblockedAccountsBalance("Общая сумма по всем незаблокированным счетам: ", client);
	case 8 -> accountView.printUnblockedAccountsWithPosBalance("Общая сумма по всем незаблокированным счетам, имеющим положительный баланс: ", client);
	case 9 -> accountView.printUnblockedAccountsWithNegBalance("Общая сумма по всем незаблокированным счетам, имеющим отрицательный баланс: ", client);
	case 10 -> accountLogic.blockAccount(client, inputAccountNumber("Укажите номер счета: "));
	case 11 -> accountLogic.unblockAccount(client, inputAccountNumber("Укажите номер счета: "));
	case 0 -> {
	    System.out.println("Работа программы завершена!");
	    System.exit(0);
	}
	}
    }

    private static int inputActionNumber(String message) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);

	System.out.print(message);
	while (!scanner.hasNextInt()) {
	    System.out.print(message);
	    scanner.next();
	}

	return scanner.nextInt();
    }

    private static String inputAccountNumber(String message) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);

	System.out.print(message);
	while (!scanner.hasNextLine()) {
	    System.out.print(message);
	    scanner.next();
	}

	return scanner.nextLine();
    }
}