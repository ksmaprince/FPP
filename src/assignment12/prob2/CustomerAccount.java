package assignment12.prob2;

public class CustomerAccount {
    private String Cus_name;
    private String Acc_No;
    private Double Balance;

    public CustomerAccount(String cus_name, String acc_No, Double balance) {
        Cus_name = cus_name;
        Acc_No = acc_No;
        Balance = balance;
    }

    public boolean deposit(double amount) throws NegativeValueException {
        if (amount < 0) {
            throw new NegativeValueException("Amount must be greater than 0.");
        }
        Balance += amount;
        return true;
    }

    public boolean widthdraw(double amount) throws ExceedBalanceException, ReachBelowBalanceException {
        if (amount > Balance) {
            throw new ExceedBalanceException("You have no enough balance for your amount.");
        }
        if (Balance < 100) {
            throw new ReachBelowBalanceException("Your balance is below $100.");
        }
        Balance -= amount;
        return true;
    }

    public double getBalance() throws ReachBelowBalanceException {
        if (Balance < 100) {
            throw new ReachBelowBalanceException("Your balance is below $100.");
        }
        return Balance;
    }


    public static void main(String[] args) {
        CustomerAccount account1 = new CustomerAccount("AAA", "A12345", 1000.0);
        try {
            account1.deposit(500.0);
            System.out.println("Balance Amount: " + account1.getBalance());
            account1.deposit(-100);
        } catch (ReachBelowBalanceException | NegativeValueException e) {
            System.out.println(e.getMessage());
        }

        try {
            account1.widthdraw(450.0);
            System.out.println("Balance Amount: " + account1.getBalance());
            account1.widthdraw(2000);
        } catch (ReachBelowBalanceException | ExceedBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            account1.widthdraw(1000.0);
            System.out.println("Balance Amount: " + account1.getBalance());
        } catch (ExceedBalanceException | ReachBelowBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
