package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenSameFeetReference_shouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Assert.assertEquals(feet1, feet1);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNullValue_shouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenSameInchReference_shouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Assert.assertEquals(inch1, inch1);
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNullValue_shouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenValuesWithDifferentType_shouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Feet feet1 = new Feet(0.0);
        Assert.assertNotEquals(inch1, feet1);
    }
}
