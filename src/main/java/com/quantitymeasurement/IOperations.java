package com.quantitymeasurement;

public class IOperations implements Operations{

    @Override
    public boolean compare(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if(!quantity1.unit.quantityType.equals(quantity2.unit.quantityType)) {
            throw new QuantityException(QuantityException.ExceptionType.DIFFERENT_QUANTITY_TYPE, "Different type of quantities ");
        }
        return Double.compare(quantity1.value * quantity1.unit.baseUnitComparison,
                quantity2.value * quantity2.unit.baseUnitComparison) == 0;
    }

    @Override
    public double add(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if (!quantity1.unit.quantityType.equals(quantity2.unit.quantityType))
            throw new QuantityException(QuantityException.ExceptionType.DIFFERENT_QUANTITY_TYPE, "Different type of quantities ");
        return quantity1.getValue() * quantity1.unit.baseUnitComparison +
                quantity2.getValue() * quantity2.unit.baseUnitComparison;
    }
}
