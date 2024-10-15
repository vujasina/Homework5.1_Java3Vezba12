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

    public void charge(double total) {
        if (balance >= total) {
            balance = balance - total;
            System.out.println("Payment successful! " + "New Balance is: " + balance);
        } else {
            System.out.println("Not enough Balance. Payment cancelled!");
        }
    }
}


