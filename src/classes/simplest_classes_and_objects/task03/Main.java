package classes.simplest_classes_and_objects.task03;

import java.util.Random;

/*
 * Задача 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость 
 * (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода 
 * фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Main {
    public static void main(String[] args) {
	Student[] students = new Student[10];

	students = initStudents(students);

	printAllStudentsInfo("Список студентов:", students);
	System.out.println();
	printExcellentStudentsInfo("Список отличников:", students);
    }

    private static Student[] initStudents(Student[] students) {
	for (int i = 0; i < students.length; i++) {
	    String name = "Студент " + (i + 1);
	    int groupId = new Random().nextInt(1, 3);
	    int[] grades = new int[5];

	    for (int j = 0; j < grades.length; j++) {
		grades[j] = new Random().nextInt(8, 11);
	    }

	    students[i] = new Student(name, groupId, grades);
	}
	return students;
    }

    private static void printAllStudentsInfo(String message, Student[] students) {
	System.out.println(message);

	for (Student student : students) {
	    System.out.println(student.toString());
	}
    }

    private static boolean isExcellentStudent(int[] grades) {
	for (int grade : grades) {
	    if (grade < 9) {
		return false;
	    }
	}
	return true;
    }

    private static void printExcellentStudentsInfo(String message, Student[] students) {
	System.out.println(message);

	int count = 0;
	for (Student student : students) {
	    if (isExcellentStudent(student.getGrades())) {
		System.out.println(student.toStringShort());
		count++;
	    }
	}
	if (count == 0) {
	    System.out.println("Студентов, имеющих оценки, равные только 9 или 10, нет.");
	}
    }
}