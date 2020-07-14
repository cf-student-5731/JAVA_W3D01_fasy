package fasy.basic;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class A1_Employee {

    private String name, surname;
    private float salary;
    private int year, month, day;
    GregorianCalendar yearOfBirth;

    public A1_Employee(String name, String surname, int year, int month, int day, float salary) {
        setName(name);
        setSurname(surname);
        setYearOfBirth(year, month, day);
        setSalary(salary);
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
        this.yearOfBirth = new GregorianCalendar(year, month-1, day);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
