package com.quantitymeasurement;

import java.util.Objects;

public class Quantity {

    public Unit unit;
    public double value;

    public Quantity(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Quantity thatQuantity) {
        boolean compareCheck = unit.compare( this, thatQuantity);
        return compareCheck;
    }

    public double add(Quantity thatQuantity) {
        double sum = unit.add(this, thatQuantity);
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, value) == 0 &&
                unit == quantity.unit;
    }
}
