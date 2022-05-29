package classes.aggregation_and_composition.task01;

import java.util.ArrayList;
import java.util.List;

/*
 * Задача 1. Создать объект класса Текст, используя классы Предложение, Слово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class TextDatabase {
    private static PartOfSentence headerPart1 = new Word("Самая");
    private static PartOfSentence headerPart2 = new Word("короткая");
    private static PartOfSentence headerPart3 = new Word("в");
    private static PartOfSentence headerPart4 = new Word("мире");
    private static PartOfSentence headerPart5 = new Word("книга");

    private static Sentence header = new Sentence(headerPart1, headerPart2, headerPart3, headerPart4, headerPart5);
    
    private static List<Sentence> body = new ArrayList<Sentence>();
    static {
	PartOfSentence sentence1Part1 = new Word("Счастье");
	PartOfSentence sentence1Part2 = new PunctuationMark("-");
	PartOfSentence sentence1Part3 = new Word("это");
	PartOfSentence sentence1Part4 = new Word("просто");
	PartOfSentence sentence1Part5 = new PunctuationMark(".");
	
	PartOfSentence sentence2Part1 = new Word("Стать");
	PartOfSentence sentence2Part2 = new Word("счастливым");
	PartOfSentence sentence2Part3 = new Word("может");
	PartOfSentence sentence2Part4 = new Word("любой");
	PartOfSentence sentence2Part5 = new Word("человек");
	PartOfSentence sentence2Part6 = new PunctuationMark(",");
	PartOfSentence sentence2Part7 = new Word("в");
	PartOfSentence sentence2Part8 = new Word("любом");
	PartOfSentence sentence2Part9 = new Word("месте");
	PartOfSentence sentence2Part10 = new PunctuationMark(",");
	PartOfSentence sentence2Part11 = new Word("в");
	PartOfSentence sentence2Part12 = new Word("любое");
	PartOfSentence sentence2Part13 = new Word("время");
	PartOfSentence sentence2Part14 = new PunctuationMark(".");

	body.add(new Sentence(sentence1Part1, sentence1Part2, sentence1Part3, sentence1Part4, sentence1Part5));
	body.add(new Sentence(sentence2Part1, sentence2Part2, sentence2Part3, sentence2Part4, sentence2Part5, sentence2Part6, sentence2Part7, sentence2Part8, sentence2Part9,
		sentence2Part10, sentence2Part11, sentence2Part12, sentence2Part13, sentence2Part14));
    }

    public Text getText() {
	return new Text(header, body);
    }
}