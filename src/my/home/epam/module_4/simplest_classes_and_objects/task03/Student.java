package my.home.epam.module_4.simplest_classes_and_objects.task03;

import java.util.Arrays;

/*
 * Задача 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость 
 * (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода 
 * фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {
    private String name;
    private int groupId;
    private static final int exams = 5;
    private int[] grades = new int[exams];

    public Student() {
    }

    public Student(String name, int groupId, int[] grades) {
	super();
	this.name = name;
	this.groupId = groupId;
	this.grades = grades;
    }

    public String getName() {
	return name;
    }

    public void setSurname(String name) {
	this.name = name;
    }

    public int getGroupId() {
	return groupId;
    }

    public void setGroupId(int groupId) {
	this.groupId = groupId;
    }

    public int[] getGrades() {
	return grades;
    }

    public void setGrades(int[] grades) {
	this.grades = grades;
    }

    @Override
    public String toString() {
	return "Имя: " + name + ", группа: " + groupId + ", успеваемость: " + Arrays.toString(grades) + "]";
    }

    public String toStringShort() {
	return "Имя: " + name + ", группа: " + groupId;
    }
}