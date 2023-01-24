package Week5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void onePlusOneShouldEqualTwo () {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void onePlusOneShouldEqualTen () {
        SimpleCalculator calculator = new SimpleCalculator();
        assertTrue(calculator.add(4, 6) == 10);
    }

    @Test
    void tenDividedby3DoesNotEqual0 () {
        assertNotEquals(0,SimpleCalculator.divide(10, 3));
    }

    @Test
    void onePlusOneDoesntEqual10 () {
        SimpleCalculator calculator = new SimpleCalculator();
        assertFalse(calculator.add(1,1) != 2);
    }

    @Test
    void cannotDivideByZero () {
        SimpleCalculator calculator = new SimpleCalculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(10,0) );
    }

    @Test
    void unableToDivideByZero(){
        int number1 = 10;
        int number2 = 1;
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.divide(number1,number2);

        assertNotEquals(0, number2);
    }

    @Test
    void oneMinusOneEqualsZero(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(0, calculator.subtract(1,1));

    }

    @Test
    void tenTimesOneEqualsTen(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(10,calculator.multiply(10,1));
    }

    @Test
    void areTheseArraysEqual() {
        int array1[] = {1,2,3};
        int array2[] = {1,2,3};
        assertArrayEquals(array1,array2);
    }

    @Test
    void stirngIsNull() {
        String message = null;
        assertNull(message, message);
    }

    @Test
    void stringIsNotNull(){
        String message = "I love math";
        assertNotNull(message);
    }

    @Test
    void sumOfThreeNumbers(){
        SimpleCalculator calculator = new SimpleCalculator();
        int sum[] = {1,2,3};
        assertEquals(6, calculator.sum(sum));
    }

}