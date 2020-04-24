package com.quantitymeasurement;

public class QuantityException extends Exception {
    ExceptionType type;

    public enum ExceptionType {
        NEGATIVE_VALUE, DIFFERENT_QUANTITY_TYPE, TEMPERATURE_VALUE
    }

    public QuantityException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
