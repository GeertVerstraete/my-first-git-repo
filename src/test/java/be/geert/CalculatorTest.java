package be.geert;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aryastark on 21/06/16.
 */
public class CalculatorTest  {
@Test
    public void sumOfNumbersIsCorrect() {
    int sum=Calculator.add(2,2);
    System.out.println(sum);
    Assert.assertEquals(4,sum);
}
    @Test
    public void sumOfNumbersIsCorrectSecond() {
        int sum=Calculator.add(5,-8);
        System.out.println(sum);
        Assert.assertEquals(-3,sum);
    }
}
