package classes.aggregation_and_composition.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Задача 1. Создать объект класса Текст, используя классы Предложение, Слово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class TextLogic {
    private static TextDatabase textDatabase = new TextDatabase();

    public Text initText() {
	return textDatabase.getText();
    }

    public void printHeader(Text text) {
	text.getHeader().printSentence();
	System.out.println();
    }

    public void printBody(Text text) {
	for (Sentence sentence : text.getBody()) {
	    sentence.printSentence();
	}
    }

    public void printText(Text text) {
	printHeader(text);
	printBody(text);
    }

    public void addSentence(Text text) {
	List<PartOfSentence> listOfPartsOfSentence = new ArrayList<PartOfSentence>();

	int wordsCount = 0;
	while (true) {
	    String newWord;
	    newWord = inputPartOfSentence("Введите слово или знак препинания (чтобы завершить, введите \"0\"): ");
	    if (newWord.equals("0")) {
		break;
	    }
	    listOfPartsOfSentence.add(new Word(newWord));
	    wordsCount++;
	}

	PartOfSentence[] partsOfSentence = new PartOfSentence[wordsCount];

	for (int i = 0; i < partsOfSentence.length; i++) {
	    partsOfSentence[i] = listOfPartsOfSentence.get(i);
	}

	text.getBody().add(new Sentence(partsOfSentence));
    }

    private static String inputPartOfSentence(String message) {
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