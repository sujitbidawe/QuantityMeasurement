package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    Operations operations = new IOperations();

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() throws QuantityException {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Quantity feet2 = new Quantity(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenSameFeetReference_shouldReturnEqual() throws QuantityException {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet1);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() throws QuantityException {
        Quantity feet1 = new Quantity(Unit.FEET,0.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNullValue_shouldReturnNotEqual() throws QuantityException {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Quantity feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenFeetAndDifferentType_shouldReturnNotEqual() throws QuantityException {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        String someString = "test";
        Assert.assertNotEquals(feet1, someString);
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity inch2 = new Quantity(Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenSameInchReference_shouldReturnEqual() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch1);
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity inch2 = new Quantity(Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNullValue_shouldReturnNotEqual() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchAndDifferentType_shouldReturnNotEqual() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        String someString = "test";
        Assert.assertNotEquals(inch1, someString);
    }

    @Test
    public void givenValuesWithDifferentType_shouldReturnNotEqual() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Assert.assertNotEquals(inch1, feet1);
    }

    @Test
    public void given0FeetAnd0Inch_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        boolean compareCheck = operations.compare(inch1, feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = operations.compare(inch1, feet1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = operations.compare(feet2, feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_whenCompared_shouldReturnNotEqual() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = operations.compare(feet1, inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 12.0);
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = operations.compare(inch1, feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 12.0);
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = operations.compare(feet1, inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity feet1 = new Quantity(Unit.FEET, 3.0);
        Quantity yard1 = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = operations.compare(yard1, feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_whenCompared_shouldReturnNotEqual() throws QuantityException {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity yard1 = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = operations.compare(yard1, feet1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_whenCompared_shouldReturnNotEqual() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Quantity yard1 = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = operations.compare(yard1, inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 36.0);
        Quantity yard1 = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = operations.compare(yard1, inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36inchAnd1Yard_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 36.0);
        Quantity yard1 = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = operations.compare(inch1, yard1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity yard1 = new Quantity(Unit.YARD, 1.0);
        Quantity feet1 = new Quantity(Unit.FEET, 3.0);
        boolean compareCheck = operations.compare(feet1, yard1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Cm_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity cm1 = new Quantity(Unit.CM, 5);
        Quantity inch1 = new Quantity(Unit.INCH, 2);
        boolean compareCheck = operations.compare(inch1, cm1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_whenAdded_shouldReturnSum() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 2);
        Quantity inch2 = new Quantity(Unit.INCH, 2);
        double sum = operations.add(inch2, inch1);
        Assert.assertEquals(4.0, sum, 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_whenAdded_shouldReturnSum() throws QuantityException {
        Quantity feet1 = new Quantity(Unit.FEET, 1);
        Quantity inch2 = new Quantity(Unit.INCH, 2);
        double sum = operations.add(inch2, feet1);
        Assert.assertEquals(14.0, sum, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_whenAdded_shouldReturnSum() throws QuantityException {
        Quantity feet1 = new Quantity(Unit.FEET, 1);
        Quantity feet2 = new Quantity(Unit.FEET, 1);
        double sum = operations.add(feet2, feet1);
        Assert.assertEquals(24, sum, 0.0);
    }

    @Test
    public void given2InchAnd2Point5Cm_whenAdded_shouldReturnSum() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 2.0);
        Quantity cm1 = new Quantity(Unit.CM, 2.5);
        double sum = operations.add(cm1, inch1);
        Assert.assertEquals(3, sum, 0.0);
    }

    @Test
    public void given1GallonAnd3Point78litres_whenCompared_shouldRetunEqual() throws QuantityException {
        Quantity gallon1 = new Quantity(Unit.GALLON, 1.0);
        Quantity litre1 = new Quantity(Unit.LITRE, 3.78);
        boolean compareCheck = operations.compare(litre1, gallon1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1LitreAnd1000MiliLitres_whenCompared_shouldRetunEqual() throws QuantityException {
        Quantity litre1 = new Quantity(Unit.LITRE, 1.0);
        Quantity miliLitre1 = new Quantity(Unit.MILILITRE, 1000.0);
        boolean compareCheck = operations.compare(miliLitre1, litre1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3Point78Litre_whenAdded_shouldReturnSum() throws QuantityException {
        Quantity gallon1 = new Quantity(Unit.GALLON, 1.0);
        Quantity litre1 = new Quantity(Unit.LITRE, 3.78);
        double sum = operations.add(litre1, gallon1);
        Assert.assertEquals(7.56, sum, 0.0);
    }

    @Test
    public void given1LitreAnd1000MiliLitre_whenAdded_shouldReturnSum() throws QuantityException {
        Quantity litre1 = new Quantity(Unit.LITRE, 1);
        Quantity miliLittre1 = new Quantity(Unit.MILILITRE, 1000.0);
        double sum = operations.add(miliLittre1, litre1);
        Assert.assertEquals(2.0, sum, 0.0);
    }

    @Test
    public void given1KgAnd1000Grams_whenAdded_shouldReturnSum() throws QuantityException {
        Quantity kg1 = new Quantity(Unit.KG, 1.0);
        Quantity gram1 = new Quantity(Unit.GRAM, 1000.0);
        double sum = operations.add(gram1, kg1);
        Assert.assertEquals(2, sum, 0.0);
    }

    @Test
    public void given1KgAnd1000Grams_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity kg1 = new Quantity(Unit.KG, 1.0);
        Quantity gram1 = new Quantity(Unit.GRAM, 1000.0);
        boolean compareCheck = operations.compare(gram1, kg1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Kgs_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity tonne1 = new Quantity(Unit.TONNE, 1.0);
        Quantity kg1 = new Quantity(Unit.KG, 1000.0);
        boolean compareCheck = operations.compare(kg1, tonne1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Kgs_whenAdded_shouldReturnSum() throws QuantityException {
        Quantity tonne1 = new Quantity(Unit.TONNE, 1.0);
        Quantity kg1 = new Quantity(Unit.KG, 1000.0);
        double sum = operations.add(kg1, tonne1);
        Assert.assertEquals(2000, sum, 0.0);
    }

    @Test
    public void given1TonneAnd1000Grams_whenAdded_shouldReturnSum() throws QuantityException {
        Quantity tonne1 = new Quantity(Unit.TONNE, 1.0);
        Quantity gram1 = new Quantity(Unit.GRAM, 1000.0);
        double sum = operations.add(gram1, tonne1);
        Assert.assertEquals(1001, sum, 0.0);
    }

    @Test
    public void givenDifferentQuantityTypes_whenAdded_shouldThrowException() throws QuantityException {
        try {
            Quantity kg1 = new Quantity(Unit.KG, 1.0);
            Quantity inch1 = new Quantity(Unit.INCH, 1.0);
            double sum = operations.add(kg1, inch1);
        }catch (QuantityException e){
            Assert.assertEquals(QuantityException.ExceptionType.DIFFERENT_QUANTITY_TYPE, e.type);
        }
    }

    @Test
    public void givenDifferentQuantityTypes_whenCompared_shouldThrowException() throws QuantityException{
        try {
            Quantity kg1 = new Quantity(Unit.KG, 1.0);
            Quantity inch1 = new Quantity(Unit.INCH, 1.0);
            boolean compareCheck = operations.compare(kg1, inch1);
        }catch (QuantityException e){
            Assert.assertEquals(QuantityException.ExceptionType.DIFFERENT_QUANTITY_TYPE, e.type);
        }
    }

    @Test
    public void givenNegativeQuantityForLength_shouldThrowException() throws QuantityException{
        try {
            Quantity gallon1 = new Quantity(Unit.GALLON, -1.0);
            Quantity gallon2 = new Quantity(Unit.GALLON, -1.0);
            boolean compareCheck = operations.compare(gallon1, gallon2);
        } catch (QuantityException e){
            Assert.assertEquals(QuantityException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }

    @Test
    public void given212FahrenheitAnd100Celsius_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity fahrenheit1 = new Quantity(Unit.FAHRENHEIT, 212.0);
        Quantity celsius1 = new Quantity(Unit.CELSIUS, 100.0);
        boolean compareCheck = operations.compare(fahrenheit1, celsius1);
        Assert.assertTrue(compareCheck);
    }
}
