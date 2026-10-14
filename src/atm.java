class atmMoney {

    double balance = 1000;

    void showBalance() {
        System.out.println("Available balance is: " + balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited successfully. New balance is: " + balance);
    }

    void withdraw(double amount) {
        if (amount >= balance) {
            System.out.println("Insufficient funds to withdraw your amount " + amount + ". Your balance is: " + balance);
        } else {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully. New balance is: " + balance);
        }
    }
}

public class atm {

    public static void main(String[] args) {
        atmMoney obj = new atmMoney();
        obj.showBalance();
        obj.deposit(500);
        obj.withdraw(2000);
        obj.withdraw(750);
        obj.deposit(1000);
    }
}
