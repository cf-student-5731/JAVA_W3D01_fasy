package fasy.basic;

import java.util.ArrayList;

public class A1 {

    public static void main(String[] args) {

        A1_Employee emp01 = new A1_Employee("John", "Doe", 1975, 12, 31, 25000f);
        A1_Employee emp02 = new A1_Employee("Jane", "Doe", 1978, 12, 31, 30500f);

        ArrayList<A1_Employee> employees = new ArrayList<>();
        employees.add(emp01);
        employees.add(emp02);

        for(A1_Employee e : employees){
            System.out.printf("%s %s, Year of Birth: %-10d Salary: %.2f %n", e.getName(), e.getSurname(), e.getYearOfBirth(), e.getSalary());
        }

    }
}
