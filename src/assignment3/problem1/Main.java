package assignment3.problem1;

public class Main {
    public static void main(String[] args) {

        //Assignment 3 - Problem 1

        Address address1 = new Address("100 N Street, AABB", "NewYork", "11111");
        Address address2 = new Address("28 B Orange Street, University Ave", "Chicago", "22222");
        Address address3 = new Address("103 Nth Street, Sea Road", "Chicago", "33333");


        Customer[] customers = {new Customer("John", "Snow", "213-331-8888", address1, address1),
                new Customer("Joe", "Smit", "332-221-4444", address2, address2),
                new Customer("Arthar", "Richard", "212-331-5555", address3, address3)};


        for (Customer customer : customers) {
            if (customer.billingAddress.city == "Chicago")
                System.out.println(customer.toString());
        }
    }
}
