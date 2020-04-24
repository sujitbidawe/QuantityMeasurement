package com.quantitymeasurement;

public enum Unit {

    FEET(12.0, "length"),
    INCH(1.0, "length"),
    YARD(36, "length"),
    CM(1.0/2.5, "length"),
    LITRE(1.0, "volume"),
    GALLON(3.78, "volume"),
    MILILITRE(1.0/1000.0, "volume"),
    KG(1.0, "weight"),
    GRAM(1.0/1000.0, "weight"),
    TONNE(1000.0, "weight"),
    CELSIUS(1, "temperature"),
    FAHRENHEIT(5.0/9.0, "temperature");

    public double baseUnitComparison;
    public String quantityType;

    Unit(double baseUnitComparison, String quantityType){
        this.baseUnitComparison = baseUnitComparison;
        this.quantityType = quantityType;
    }
}
