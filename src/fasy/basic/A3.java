package fasy.basic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class A3 {

    public static void main(String[] args) {

        A3_Student stud01 = new A3_Student("John", "Doe", 2012, 12, 31, "a1");
        A3_Student stud02 = new A3_Student("Jane", "Doe", 2017, 12, 31, "b3");

        ArrayList<A3_Student> employees = new ArrayList<>();
        employees.add(stud01);
        employees.add(stud02);

        for(A3_Student s : employees){
            System.out.printf("%s %s, born in: %d, age %d, goes to class %s %n", s.getName(), s.getSurname(), s.getYearOfBirth(), getAge(s), s.getStudClass());
        }
    }

    public static int getAge(A3_Student s){
        GregorianCalendar date = new GregorianCalendar();
        int age = date.get(Calendar.YEAR) - s.getYearOfBirth();
        return age;
    }

}
