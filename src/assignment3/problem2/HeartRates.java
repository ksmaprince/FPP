package assignment3.problem2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

//Assignment 3 - Problem 2
public class HeartRates {
    String firstName;
    String lastName;
    LocalDate dateOfBirth;

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Period calculateAge(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today); // Return periods as Year, Month and Days
    }

    //method to input date of birth properly
    public static LocalDate getBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        Scanner sc = new Scanner(System.in);
        LocalDate birthday;
        while (true) {
            System.out.println("Please, enter your birth date in the " +
                    "format-(yyyy-mm-dd)-Example-1988-4-14");
            String input = sc.nextLine();
            try {
                birthday = LocalDate.parse(input, formatter);
                return birthday;
            } catch (DateTimeParseException e) {
                System.out.println("Date format error!,please try again.");
            }
        }
    }


    //method to calculate and reture maximum heart rate
    public int getMaxHeartRate(int age) {
        return 220 - age;
    }

    //method to calculate and print the heart rate range
    public void printHeartRateRange() {
        //Maximum heart rate depen on age
        int MHR = getMaxHeartRate(calculateAge(dateOfBirth).getYears());

        //Calculate average heart rate
        //Resting Heart Rate (RHR)
        int RHR = 70;
        int AHR = MHR - RHR;

        //Calculate upper & lower boundary target heart rate
        //Lower Boundary (LB)
        double LB = 0.5;
        double LBTHR = (AHR * LB) + RHR;
        //Upper Boundary (UB)
        double UB = 0.85;
        double UBTHR = (AHR * UB) + RHR;

        System.out.println("The Target Heart Rate Range is between " + LBTHR + " and " + UBTHR);
    }


    @Override
    public String toString() {
        Period age = calculateAge(dateOfBirth);
        return "First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nAge: " + age.getYears() +
                "\nDate of Birth: " + dateOfBirth +
                "\nMaximum Heart Rate: " + getMaxHeartRate(age.getYears());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input First name and Last name
        System.out.println("Please, enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Please, enter your last name: ");
        String lastName = sc.nextLine();

        //Input Birthday
        LocalDate birthday = getBirthday();

        //Initialize the HeartRates instance
        HeartRates heartRates = new HeartRates(firstName, lastName, birthday);

        //Print heart rate range
        heartRates.printHeartRateRange();

        //Print the information using toString() override method
        System.out.println(heartRates);
                                      
        sc.close();
    }
}
