package my.home.epam.module_4.aggregation_and_composition.task01;

import java.util.List;

/*
 * Задача 1. Создать объект класса Текст, используя классы Предложение, Слово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Text {
    private Sentence header;
    private List<Sentence> body;

    public Text() {
	super();
    }

    public Text(Sentence header, List<Sentence> body) {
	super();
	this.header = header;
	this.body = body;
    }

    public Sentence getHeader() {
	return header;
    }

    public List<Sentence> getBody() {
	return body;
    }

    public void setBody(List<Sentence> body) {
	this.body = body;
    }
}