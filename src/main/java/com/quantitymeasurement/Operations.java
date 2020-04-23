package com.quantitymeasurement;

public interface Operations {

    boolean compare(Quantity quantity1, Quantity quantity2) throws QuantityException ;
    double add(Quantity quantity1, Quantity quantity2) throws QuantityException;
}
