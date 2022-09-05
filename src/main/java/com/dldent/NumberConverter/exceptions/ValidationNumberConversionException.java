package com.dldent.NumberConverter.exceptions;

public class ValidationNumberConversionException extends ConversionException{
    public ValidationNumberConversionException(int value) {
        super("Incorrect value " + value + ". Choose a number 1-3999.");
    }
}