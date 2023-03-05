import java.util.*;

public class Account {

    double balance;

    Account() {
        balance = 0.0;
    }

    Account(double b) {
        this.balance = b;
    }

    Double checkBalance() {
        return this.balance;
    }

    double depositBalance(double b) {
        balance += b;
        return balance;
    }

    double withdrawBalance(double b) {
        balance -= b;
        return balance;
    }

    public static void main(String args[]) {
        Account a1 = new Account();
        Account a2 = new Account(1000.0);
        Account a3 = new Account();

        ArrayList<Account> AL = new ArrayList<Account>();
        // ArrayList AL = new ArrayList();
        AL.add(a1);
        AL.add(a2);
        AL.add(a3);

        System.out.println("Total Number of accounts:" + AL.size());
        for (int i = 0; i < AL.size(); i++) {
            Account obj = AL.get(i); // without single type<Account> it shows error. we can resove this error using
                                     // downcasting.
            double bal = obj.checkBalance();
            if (bal <= 0) {
                System.out.println("Deleting");
                AL.remove(i);
            }
        }
        System.out.println("Total Number of accounts after deletion:" + AL.size());
    }
}
