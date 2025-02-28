public class bankaccount {
    public String accountHolder;
    public double balance;
    public int accountNumber; 

    public bankaccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdrawal(double amount) {
        if (amount <= balance) { 
            balance = balance-amount;
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    public void deposit(double amount) {
            balance=balance+amount;
            System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        bankaccount ba = new bankaccount("Kasi Harini", 24203, 1000);
        ba.withdrawal(600);
        ba.deposit(2000);
    }
}