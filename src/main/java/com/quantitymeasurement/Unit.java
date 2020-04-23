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
    TONNE(1000.0, "weight");

    private final double baseUnitComparison;
    private String quantityType;

    Unit(double baseUnitComparison, String quantityType){
        this.baseUnitComparison = baseUnitComparison;
        this.quantityType = quantityType;
    }

    public boolean compare(Quantity q1, Quantity q2) {
        if(!q1.unit.quantityType.equals(q2.unit.quantityType)) {
            System.out.println("Incomparable quantity types!");
            return false;
        }
        return Double.compare(q1.value * q1.unit.baseUnitComparison,
                q2.value * q2.unit.baseUnitComparison) == 0;
    }

    public double add(Quantity q1, Quantity q2) {
        return q1.value * q1.unit.baseUnitComparison +
                q2.value * q2.unit.baseUnitComparison;
    }
}
