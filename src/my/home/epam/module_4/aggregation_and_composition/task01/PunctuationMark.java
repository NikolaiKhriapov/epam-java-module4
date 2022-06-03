package my.home.epam.module_4.aggregation_and_composition.task01;

/*
 * Задача 1. Создать объект класса Текст, используя классы Предложение, Слово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class PunctuationMark implements PartOfSentence {
    private final String punctuationMark;

    public PunctuationMark(String punctuationMark) {
	super();
	this.punctuationMark = punctuationMark;
    }

    public String getValue() {
	return punctuationMark;
    }
}