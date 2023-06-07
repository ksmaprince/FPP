package assignment5.problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    double baseSalary;

    BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment() {
        return baseSalary + super.getPayment();
    }
}
