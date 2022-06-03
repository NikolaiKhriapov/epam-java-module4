package my.home.epam.module_4.aggregation_and_composition.task01;

import java.util.ArrayList;
import java.util.List;

/*
 * Задача 1. Создать объект класса Текст, используя классы Предложение, Слово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Sentence {
    private final List<PartOfSentence> sentence = new ArrayList<PartOfSentence>();

    public Sentence(PartOfSentence... partsOfSentence) {
	for (int i = 0; i < partsOfSentence.length; i++) {
	    if ((i > 0) && (partsOfSentence[i].getValue().equals("-"))) {
		sentence.add(new PunctuationMark(" "));
		sentence.add(partsOfSentence[i]);
	    } else if ((i > 0) && (!(partsOfSentence[i].getValue().equals(",") || partsOfSentence[i].getValue().equals(":") 
		    || partsOfSentence[i].getValue().equals(";") || partsOfSentence[i].getValue().equals(".")))) {
		sentence.add(new PunctuationMark(" "));
		sentence.add(partsOfSentence[i]);
	    } else {
		sentence.add(partsOfSentence[i]);
	    }
	}
    }

    public void printSentence() {
	for (PartOfSentence partOfSentence : sentence) {
	    System.out.print(partOfSentence.getValue());
	}
	System.out.print(" ");
    }
}