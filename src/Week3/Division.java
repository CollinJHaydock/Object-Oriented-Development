package Week3;

import java.util.*;

public class Division {

    public static void main(String[] args) {
        int quotient = 0;

        System.out.print("Please enter the first number.");
        Scanner s1 = new Scanner(System.in);
        int num1 = s1.nextInt();

        System.out.print("Please enter the second number.");
        Scanner s2 = new Scanner(System.in);
        int num2;

        do {
            num2 = s2.nextInt();

            if (num2 ==0) {
                System.out.println("A number cannot be divided by 0, please enter a number other than 0");
            }

        } while (num2 == 0);

        try {
            quotient = num1/num2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Your quotient is " + quotient + ".");
        }
}
