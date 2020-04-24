package com.quantitymeasurement;

public class IOperations implements Operations{

    @Override
    public boolean compare(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if(!quantity1.getUnit().quantityType.equals(quantity2.getUnit().quantityType)) {
            throw new QuantityException(QuantityException.ExceptionType.DIFFERENT_QUANTITY_TYPE, "Different type of quantities");
        }
        if(quantity1.getUnit().equals(Unit.FAHRENHEIT)){
            double quantity1InCelsius = ((quantity1.getValue() - 32 ) * quantity1.getUnit().baseUnitComparison);
            return Double.compare(quantity2.getValue(), quantity1InCelsius) == 0;
        }
        if(quantity2.getUnit().equals(Unit.FAHRENHEIT)){
            double quantity2InCelsius = ((quantity2.getValue() - 32 ) * quantity2.getUnit().baseUnitComparison);
            return Double.compare(quantity1.getValue(), quantity2InCelsius) == 0;
        }
        return Double.compare(quantity1.getValue() * quantity1.getUnit().baseUnitComparison,
                quantity2.getValue() * quantity2.getUnit().baseUnitComparison) == 0;
    }

    @Override
    public double add(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if (!quantity1.getUnit().quantityType.equals(quantity2.getUnit().quantityType)) {
            throw new QuantityException(QuantityException.ExceptionType.DIFFERENT_QUANTITY_TYPE, "Different type of quantities");
        }
        if (quantity1.getUnit().quantityType.equals("temperature")){
            throw new QuantityException(QuantityException.ExceptionType.TEMPERATURE_VALUE, "Temperature cannot be added!");
        }
        return quantity1.getValue() * quantity1.getUnit().baseUnitComparison +
                quantity2.getValue() * quantity2.getUnit().baseUnitComparison;
    }
}
