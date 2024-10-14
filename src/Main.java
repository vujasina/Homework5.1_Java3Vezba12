import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial Balance: ");
        double initialBalance = scanner.nextDouble();
        Card card = new Card(initialBalance);
        while (card.balance > 0) {
            card.charge();
        }
    }
}
