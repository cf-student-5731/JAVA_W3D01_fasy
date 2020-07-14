package fasy.basic;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class A3_Student {

    private String name, surname, studClass;
    private int year, month, day;
    GregorianCalendar yearOfBirth;

    public A3_Student(String name, String surname, int year, int month, int day, String studClass) {
        setName(name);
        setSurname(surname);
        setYearOfBirth(year, month, day);
        setStudClass(studClass);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth.get(Calendar.YEAR);
    }

    public void setYearOfBirth(int year, int month, int day) {
        this.yearOfBirth = new GregorianCalendar(year, month - 1, day);
    }

    public String getStudClass() {
        return studClass;
    }

    public void setStudClass(String studClass) {
        this.studClass = studClass;
    }

}
