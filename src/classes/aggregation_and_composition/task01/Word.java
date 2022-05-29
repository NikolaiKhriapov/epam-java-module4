package classes.aggregation_and_composition.task01;

/*
 * Задача 1. Создать объект класса Текст, используя классы Предложение, Слово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Word implements PartOfSentence {
    private final String word;

    public Word(String word) {
	super();
	this.word = word;
    }

    public String getValue() {
	return word;
    }
}