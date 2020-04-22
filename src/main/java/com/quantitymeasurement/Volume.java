package com.quantitymeasurement;

public class Volume {
    public Unit unit;
    public double value;

    public Volume(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Volume thatVolume) {
        boolean compareCheck = unit.compare(this, thatVolume);
        return compareCheck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

}
