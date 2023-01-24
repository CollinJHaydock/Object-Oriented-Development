package Week5;

public class SimpleCalculator {
    public static int add (int number1, int number2) {
    return number1 + number2;
    }

    public int sum (int[] numbers) {

        int sum = 0;
        for (int i = 0;  i <= numbers.length; i++) {
            sum += i;
        }
        return sum;
    }

    public static int subtract (int number1, int number2) {
    return number1-number2;
    }

    public static int multiply (int number1, int number2) {
    return number1 * number2;
    }

    public static int divide (int number1, int number2) {

        int quotient = number1/number2;
        try {
            return quotient;
        } catch (ArithmeticException e) {
            System.err.println(e.toString());
        }
        return quotient;
    }
}
