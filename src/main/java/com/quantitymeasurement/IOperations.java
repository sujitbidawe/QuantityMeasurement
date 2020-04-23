package com.quantitymeasurement;

public class IOperations implements Operations{

    @Override
    public boolean compare(Quantity q1, Quantity q2) throws QuantityException {
        if(!q1.unit.quantityType.equals(q2.unit.quantityType)) {
            throw new QuantityException(QuantityException.ExceptionType.DIFFERENT_QUANTITY_TYPE, "Different type of quantities ");
        }
        return Double.compare(q1.value * q1.unit.baseUnitComparison,
                q2.value * q2.unit.baseUnitComparison) == 0;
    }

    @Override
    public double add(Quantity q1, Quantity q2) throws QuantityException {
        if (!q1.unit.quantityType.equals(q2.unit.quantityType))
            throw new QuantityException(QuantityException.ExceptionType.DIFFERENT_QUANTITY_TYPE, "Different type of quantities ");
        return q1.getValue() * q1.unit.baseUnitComparison +
                q2.getValue() * q2.unit.baseUnitComparison;
    }
}
