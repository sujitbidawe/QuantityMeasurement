package com.quantitymeasurement;

public class Quantity {

    private Unit unit;
    private double value;

    public Quantity(Unit unit, double value) throws QuantityException {
        this.unit = unit;
        if(value < 0.0 && !unit.quantityType.equals("temperature")){
            throw new QuantityException(QuantityException.ExceptionType.NEGATIVE_VALUE, "quantities cannot be negative");
        }
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, value) == 0 && unit == quantity.unit;
    }
}
