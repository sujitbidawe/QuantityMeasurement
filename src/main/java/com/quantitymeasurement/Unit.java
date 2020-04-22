package com.quantitymeasurement;

public enum Unit {

    FEET(12.0), INCH(1.0), YARD(36), CM(1.0/2.5),
    LITRE(1000), GALLON(3780);

    private final double baseUnitComparison;

    Unit(double baseUnitComparison){
        this.baseUnitComparison = baseUnitComparison;
    }

    public boolean compare(Length l1, Length l2){
        return Double.compare(l1.value * l1.unit.baseUnitComparison,
                              l2.value * l2.unit.baseUnitComparison) == 0;
    }

    public boolean compare(Volume v1, Volume v2){
        return Double.compare(v1.value * v1.unit.baseUnitComparison,
                v2.value * v2.unit.baseUnitComparison) == 0;
    }

    public double add(Length l1, Length l2) {
        return l1.value * l1.unit.baseUnitComparison +
                l2.value * l2.unit.baseUnitComparison;
    }
}
