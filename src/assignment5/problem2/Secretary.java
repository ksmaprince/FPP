package assignment5.problem2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {

    private double overtimeHours;

    Secretary(String name, double salary, LocalDate hireDate, double overtimeHours) {
        super(name, salary, hireDate);
        this.overtimeHours = overtimeHours;
    }

    @Override
    protected double computeSalary() {
        double salary = super.computeSalary() + (12 * overtimeHours);
        return salary;
    }
}
