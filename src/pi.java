// (1) pi/4
// (2) 1 - 1/3 + 1/5 - 1/7 ... (Alternating)
// (3) Compute with a 'for loop'

import java.util.Scanner;

public class pi {
    public static void main(String[] args) {
        System.out.println("pi = " + Math.PI);

        Scanner input = new Scanner(System.in);
        System.out.print("How many terms should be used? ");
        int terms = input.nextInt();

        double piOverFour = 0.0;

        for (int term = 0; term < terms; term++) {
            double fraction = 1.0 / (2 * term + 1);

            if (term % 2 == 0) {
                piOverFour += fraction;
            } else {
                piOverFour -= fraction;
            }
        }

        double estimate = 4 * piOverFour;
        System.out.println("Loop estimate = " + estimate);
        input.close();
    }
}