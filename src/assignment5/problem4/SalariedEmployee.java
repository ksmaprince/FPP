package assignment5.problem4;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPayment() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.getFirstName() + " " + super.getLastName() + " SSN: " + super.getSocialSecurityNumber() + " Payment: " + getPayment();
    }
}
