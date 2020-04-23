package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Quantity feet2 = new Quantity(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenSameFeetReference_shouldReturnEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet1);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Unit.FEET,0.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNullValue_shouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Quantity feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenFeetAndDifferentType_shouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        String someString = "test";
        Assert.assertNotEquals(feet1, someString);
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity inch2 = new Quantity(Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenSameInchReference_shouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch1);
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity inch2 = new Quantity(Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNullValue_shouldReturnNotEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchAndDifferentType_shouldReturnNotEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        String someString = "test";
        Assert.assertNotEquals(inch1, someString);
    }

    @Test
    public void givenValuesWithDifferentType_shouldReturnNotEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Assert.assertNotEquals(inch1, feet1);
    }

    @Test
    public void given0FeetAnd0Inch_whenCompared_shouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_whenCompared_shouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_whenCompared_shouldReturnEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_whenCompared_shouldReturnNotEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_whenCompared_shouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 12.0);
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_whenCompared_shouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 12.0);
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_whenCompared_shouldReturnEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 3.0);
        Quantity yard1 = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_whenCompared_shouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity yard1 = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_whenCompared_shouldReturnNotEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Quantity yard1 = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_whenCompared_shouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 36.0);
        Quantity yard1 = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36inchAnd1Yard_whenCompared_shouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 36.0);
        Quantity yard1 = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = yard1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_whenCompared_shouldReturnEqual() {
        Quantity yard1 = new Quantity(Unit.YARD, 1.0);
        Quantity feet1 = new Quantity(Unit.FEET, 3.0);
        boolean compareCheck = yard1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Cm_whenCompared_shouldReturnEqual() {
        Quantity cm1 = new Quantity(Unit.CM, 5);
        Quantity inch1 = new Quantity(Unit.INCH, 2);
        boolean compareCheck = cm1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_whenAdded_shouldReturnSum() {
        Quantity inch1 = new Quantity(Unit.INCH, 2);
        Quantity inch2 = new Quantity(Unit.INCH, 2);
        double sum = inch1.add(inch2);
        Assert.assertEquals(4.0, sum, 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_whenAdded_shouldReturnSum() {
        Quantity feet1 = new Quantity(Unit.FEET, 1);
        Quantity inch2 = new Quantity(Unit.INCH, 2);
        double sum = feet1.add(inch2);
        Assert.assertEquals(14.0, sum, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_whenAdded_shouldReturnSum() {
        Quantity feet1 = new Quantity(Unit.FEET, 1);
        Quantity feet2 = new Quantity(Unit.FEET, 1);
        double sum = feet1.add(feet2);
        Assert.assertEquals(24, sum, 0.0);
    }

    @Test
    public void given2InchAnd2Point5Cm_whenAdded_shouldReturnSum() {
        Quantity inch1 = new Quantity(Unit.INCH, 2.0);
        Quantity cm1 = new Quantity(Unit.CM, 2.5);
        double sum = inch1.add(cm1);
        Assert.assertEquals(3, sum, 0.0);
    }

    @Test
    public void given1GallonAnd3Point78litres_whenCompared_shouldRetunEqual() {
        Quantity gallon1 = new Quantity(Unit.GALLON, 1.0);
        Quantity litre1 = new Quantity(Unit.LITRE, 3.78);
        boolean compareCheck = gallon1.compare(litre1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1LitreAnd1000MiliLitres_whenCompared_shouldRetunEqual() {
        Quantity litre1 = new Quantity(Unit.LITRE, 1.0);
        Quantity miliLitre1 = new Quantity(Unit.MILILITRE, 1000.0);
        boolean compareCheck = litre1.compare(miliLitre1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3Point78Litre_whenAdded_shouldReturnSum() {
        Quantity gallon1 = new Quantity(Unit.GALLON, 1.0);
        Quantity litre1 = new Quantity(Unit.LITRE, 3.78);
        double sum = gallon1.add(litre1);
        Assert.assertEquals(7.56, sum, 0.0);
    }

    @Test
    public void given1LitreAnd1000MiliLitre_whenAdded_shouldReturnSum() {
        Quantity litre1 = new Quantity(Unit.LITRE, 1);
        Quantity miliLittre1 = new Quantity(Unit.MILILITRE, 1000.0);
        double sum = litre1.add(miliLittre1);
        Assert.assertEquals(2.0, sum, 0.0);
    }

    @Test
    public void given1KgAnd1000Grams_whenAdded_shouldReturnSum() {
        Quantity kg1 = new Quantity(Unit.KG, 1.0);
        Quantity gram1 = new Quantity(Unit.GRAM, 1000.0);
        double sum = kg1.add(gram1);
        Assert.assertEquals(2, sum, 0.0);
    }

    @Test
    public void given1KgAnd1000Grams_whenCompared_shouldReturnEqual() {
        Quantity kg1 = new Quantity(Unit.KG, 1.0);
        Quantity gram1 = new Quantity(Unit.GRAM, 1000.0);
        boolean compareCheck = kg1.compare(gram1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Kgs_whenCompared_shouldReturnEqual() {
        Quantity tonne1 = new Quantity(Unit.TONNE, 1.0);
        Quantity kg1 = new Quantity(Unit.KG, 1000.0);
        boolean compareCheck = tonne1.compare(kg1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Kgs_whenAdded_shouldReturnSum() {
        Quantity tonne1 = new Quantity(Unit.TONNE, 1.0);
        Quantity kg1 = new Quantity(Unit.KG, 1000.0);
        double sum = tonne1.add(kg1);
        Assert.assertEquals(2000, sum, 0.0);
    }

    @Test
    public void given1TonneAnd1000Grams_whenAdded_shouldReturnSum() {
        Quantity tonne1 = new Quantity(Unit.TONNE, 1.0);
        Quantity gram1 = new Quantity(Unit.GRAM, 1000.0);
        double sum = tonne1.add(gram1);
        Assert.assertEquals(1001, sum, 0.0);
    }
}
