package assignment5.problem4;

public class Driver {
    public static void main(String[] args) {
        Employee[] employees = {
                new BasePlusCommissionEmployee("John", "Smith", "3547472637", 2.5, 4.5, 150000),
                new BasePlusCommissionEmployee("Ellis", "Suee", "1238342472", 3.1, 4.5, 200000),
                new BasePlusCommissionEmployee("Prak", "Ban", "72672642746", 2.0, 4.5, 200000),
                new HourlyEmployee("Eris", "Phoo", "72679202020", 5600.56, 206.8),
                new HourlyEmployee("Owen", "Htoo", "1238342472", 4800.85, 210.6),
                new SalariedEmployee("Henry", "Nant", "27627682", 2200),
                new SalariedEmployee("Grace", "Cious", "874982742", 2100)
        };

        double totalSalary = 0.0;
        for (Employee e : employees) {
            totalSalary += e.getPayment();
            System.out.println(e.toString());
        }
        System.out.println("Total Salary: " + totalSalary);
    }
}
