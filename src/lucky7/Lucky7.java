package lucky7;

import java.util.Scanner;

public class Lucky7 {

    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Scanner scan = new Scanner(System.in);
        int money;
        int best_money;
        int best_roll = 0;
        int total_rolls = 0;

        System.out.print("How many dollars do you have? ");
        money = scan.nextInt();
        best_money = money;

        while (true) {
            d1.roll();
            d2.roll();

            int total = d1.getNumber() + d2.getNumber();
            total_rolls++;

            if (total == 7) {
                money += 4;
                if (money > 100) {
                    best_roll = total_rolls;
                    best_money = money;
                }
            } else {
                money -= 1;
            }
            if (money == 0) {
                break;
            }

        }
        System.out.println("You are broke after " + total_rolls + " rolls");
        System.out.println("You should have quit after " + best_roll + " rolls when you had $" + best_money);

    }

}
