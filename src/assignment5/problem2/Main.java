package assignment5.problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] department = new DeptEmployee[5];

        DeptEmployee p1 = new Professor("John Smith", 200000.0, LocalDate.parse("02/21/1982", DateTimeFormatter.ofPattern("MM/dd/yyyy")), 5);
        DeptEmployee p2 = new Professor("Amad Rich", 150000.0, LocalDate.parse("05/13/1979", DateTimeFormatter.ofPattern("MM/dd/yyyy")), 3);
        DeptEmployee p3 = new Professor("Juse Arther", 145000.0, LocalDate.parse("11/20/1980", DateTimeFormatter.ofPattern("MM/dd/yyyy")), 2);

        DeptEmployee s1 = new Secretary("Assad Paul", 210000.0, LocalDate.parse("05/15/1984", DateTimeFormatter.ofPattern("MM/dd/yyyy")), 38.5);
        DeptEmployee s2 = new Secretary("Obina Pie", 110000.0, LocalDate.parse("09/25/1978", DateTimeFormatter.ofPattern("MM/dd/yyyy")), 47.7);
        department[0] = p1;
        department[1] = p2;
        department[2] = p3;
        department[3] = s1;
        department[4] = s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to see the sum of salary in department(Y/N)");
        String input = sc.nextLine();
        if (input.equals("Y")) {
            double sum = 0.0;
            for (DeptEmployee deptEmployee : department) {
                System.out.println("Name: "+deptEmployee.name+" Salary: "+deptEmployee.salary+" Computed Salary: "+deptEmployee.computeSalary()+" Hired Date: "+deptEmployee.hireDate);
                sum += deptEmployee.computeSalary();
            }
            System.out.println("The sum of salary of all Professor and Secretary: " + sum);
        }
        sc.close();
    }
}
