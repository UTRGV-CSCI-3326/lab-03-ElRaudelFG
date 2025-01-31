public class BankAccount {
    public static void main (String[] args) { //workspace
        double balance = 2175.37;
        System.out.println("bob's Balance $" + balance);

        balance -= 302.50; //withdraw $302.50
        System.out.printf("withdraw $302.50. new balance is: $%.2f%n", + balance);  

        balance += 50.03; //deposit $50.03
        System.out.printf("Desposited 50.03 new balance is: $%.2f%n", + balance);  

        balance -= balance / 2; //withdraw half
        balance += 20.00; //deposit $20.00
        System.out.printf("withdrawed half of the balance and deposited $20.00. New balance is: $%.2f%n", + balance);  

        balance -= 1.00; //withdraw $1.00
        System.out.printf("Withdraw $1.00. New balance is: $%.2f%n", + balance);  

        balance *= 2; //double current balance
        System.out.printf("Doubled current balance. New balance is: $%.2f%n", + balance);  

        balance += 1.00; //deposit $1.00
        //using formatted output to round the current balance at 2 decimal places with %.2f%n
        System.out.printf("Bob's Final balance is: $%.2f%n", + balance);  
    }
}
