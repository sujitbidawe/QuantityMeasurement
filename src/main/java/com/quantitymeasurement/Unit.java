package com.quantitymeasurement;

public enum Unit {

    FEET(12.0), INCH(1.0), YARD(36);

    private final double baseUnitComparison;

    Unit(double baseUnitComparison){
        this.baseUnitComparison = baseUnitComparison;
    }

    public boolean compare(Length l1, Length l2){
        return Double.compare(l1.value * l1.unit.baseUnitComparison,
                              l2.value * l2.unit.baseUnitComparison) == 0;
    }
}
