package com.quantitymeasurement;

public class Weight {
    public Unit unit;
    public double value;

    public Weight(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Weight thatWeight) {
        boolean compareCheck = unit.compare( this, thatWeight);
        return compareCheck;
    }

    public double add(Weight thatWeight) {
        double sum = unit.add(this, thatWeight);
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return Double.compare(weight.value, value) == 0 &&
                unit == weight.unit;
    }

}
