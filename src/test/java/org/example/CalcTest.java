package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class CalcTest
{
    /**
     * Rigorous Test
     */
    @Test
    public void validateAdd()
    {
        int result = new Calculator().add(1, 2);
        Assert.assertEquals(result, 3);
    }
}
