package classes.simplest_classes_and_objects.task06;

import java.util.Date;

/*
 * Задача 6. Составьте описание класса для представления времени. Предусмотрите возможности установки 
 * времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых 
 * значений. В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы 
 * изменения времени на заданное количество часов, минут и секунд.
 */

public class MyTime {
    Date time = new Date();
    private int hrs;
    private int mins;
    private int secs;

    @SuppressWarnings("deprecation")
    public MyTime() {
	hrs = time.getHours();
	mins = time.getMinutes();
	secs = time.getSeconds();
    }

    public MyTime(int hrs, int mins, int secs) {
	super();
	this.hrs = hrs;
	this.mins = mins;
	this.secs = secs;
    }

    public int getHrs() {
	return hrs;
    }

    public void setHrs(int hrs) {
	if ((hrs < 0) || (hrs >= 24)) {
	    System.out.println("Значение часов указано неверно! Текущее значение часов установлено на 0.");
	    this.hrs = 0;
	} else {
	    this.hrs = hrs;
	}
    }

    public int getMins() {
	return mins;
    }

    public void setMins(int mins) {
	if ((mins < 0) || (mins >= 60)) {
	    System.out.println("Значение минут указано неверно! Текущее значение минут установлено на 0.");
	    this.mins = 0;
	} else {
	    this.mins = mins;
	}
    }

    public int getSecs() {
	return secs;
    }

    public void setSecs(int secs) {
	if ((secs < 0) || (secs >= 24)) {
	    System.out.println("Значение секунд указано неверно! Текущее значение секунд установлено на 0.");
	    this.secs = 0;
	} else {
	    this.secs = secs;
	}
    }

    public void setTime(int hrs, int mins, int secs) {
	setHrs(hrs);
	setMins(mins);
	setSecs(secs);
    }

    public void changeHrs(int hrs) {
	this.hrs += hrs;
	if ((hrs < 0) || (hrs >= 24)) {
	    System.out.println("Значение часов указано неверно! Текущее значение часов установлено на 0.");
	    this.hrs = 0;
	} else {
	    this.hrs = hrs;
	}
    }

    public void changeMins(int mins) {
	this.mins += mins;
	if ((mins < 0) || (mins >= 60)) {
	    System.out.println("Значение минут указано неверно! Текущее значение минут установлено на 0.");
	    this.mins = 0;
	} else {
	    this.mins = mins;
	}
    }

    public void changeSecs(int secs) {
	this.secs += secs;
	if ((secs < 0) || (secs >= 24)) {
	    System.out.println("Значение секунд указано неверно! Текущее значение секунд установлено на 0.");
	    this.secs = 0;
	} else {
	    this.secs = secs;
	}
    }
}