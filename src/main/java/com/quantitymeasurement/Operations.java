package com.quantitymeasurement;

public interface Operations {

    boolean compare(Quantity q1, Quantity q2) throws QuantityException ;
    double add(Quantity q1, Quantity q2) throws QuantityException;
}
