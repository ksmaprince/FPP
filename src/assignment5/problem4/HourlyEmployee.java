package assignment5.problem4;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return super.getFirstName() + " " + super.getLastName() + " SSN: " + super.getSocialSecurityNumber() + " Payment: " + getPayment();
    }
}
