import java.util.Scanner;

public class BankKonto {
    double balance = 0;
    String accountName;
    Scanner userInput = new Scanner(System.in);

    public double deposit100(double amount) {
        return balance += amount;
    }

    public double withdraw50(double amount) {
        return balance -= amount;
    }

    public void printBalance() {
        System.out.println("Balance: " + balance);
    }

    public void main() {
        accountName = "Jonas' konto";
        System.out.println("Hvor meget vil du sætte ind 1 gang?");
        deposit100(userInput.nextInt());
        System.out.println("Hvor meget vil du sætte ind 2 gang?");
        deposit100(userInput.nextInt());
        System.out.println("Hvor meget vil du hæve?");
        withdraw50(userInput.nextInt());
        printBalance();
    }
}
