import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double fuelPrice = fuel * 2.10;
        double totalPrice = fuelPrice + 100;

        if (day.equals("Saturday")) {
            totalPrice = totalPrice * 0.90;
        }  else {
            totalPrice = totalPrice * 0.80;
        }

        if (budget >= totalPrice) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", totalPrice - budget);
        }
    }
}
