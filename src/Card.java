import java.util.Scanner;

public class Card {

    //Polja
    double balance;

    //Konstruktori
    public Card() {

    }

    public Card(double initialBalance) {

        this.balance = initialBalance;
    }

    //Metode

    public void charge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total amount to be payed: ");
        double total = scanner.nextDouble();
        if (balance >= total) {
            balance = balance - total;
            System.out.println("Payment successful! " + "New Balance is: " + balance);
        } else {
            System.out.println("Not enough Balance. Payment cancelled!");
        }
    }
}


