package Week5;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert.*;
import org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SimpleCalculatorTest {

    @Test
    void onePlusOneShouldEqualTwo () {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(2, calculator.sum(1, 1));
    }

    @Test
    void onePlusOneShouldEqualTen () {
        SimpleCalculator calculator = new SimpleCalculator();
        assertTrue(calculator.sum(4, 6) == 10);
    }

    @Test
    void tenDividedBy3DoesNotEqual0 ()
    {
        assertNotEquals(0,SimpleCalculator.divide(10, 3));
    }

    @Test
    void onePlusOneDoesntEqual10 () {
        SimpleCalculator calculator = new SimpleCalculator();
        assertFalse(calculator.sum(1,1) != 2);
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
        int array2[] = {0,0,0};
        int sum[] = {0, 0, 0};

            for (int i = 0; i < 3; i++) {
                sum[i] = SimpleCalculator.sum(array1[i],0);
        }
        assertArrayEquals(array1,sum);
    }

    @Test
    void stringIsNull() {
        String isNull = SimpleCalculator.isNull();
        assertNull(isNull);
    }

    @Test
    void stringIsNotNull(){
        int quotient = SimpleCalculator.divide(4,2);
        assertNotNull(quotient);
    }

    @Test
    void sumOfThreeNumbers(){
        SimpleCalculator calculator = new SimpleCalculator();
        int sum[] = {1,2,3};
        assertEquals(6, calculator.sum(sum));
    }

    @Test
    void sumOfTwoDifferentNumbersIsSame() {
        int sum1 = SimpleCalculator.sum(1,2);
        int sum2 = SimpleCalculator.sum(2,1);
        assertSame(sum1, sum2);
    }

    @Test
    void sumOfTwoDifferentNumbersIsNotSame() {
        int sum1 = SimpleCalculator.sum(1,2);
        int sum2 = SimpleCalculator.sum(2,2);
        assertNotSame(sum1, sum2);
    }

    @Test
    void testThatNumber1TimesTwoIsNumber2(){
        int number1 = SimpleCalculator.multiply(1,6);
        int number2 = 6;
        assertThat(number1,is(number2));
    }

    @Test
    void testIsNull () {
        String isNull = SimpleCalculator.isNull();
        assertNull(isNull);
    }
}