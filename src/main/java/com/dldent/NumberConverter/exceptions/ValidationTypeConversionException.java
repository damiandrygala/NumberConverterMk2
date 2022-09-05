package com.dldent.NumberConverter.exceptions;

public class ValidationTypeConversionException extends ConversionException {
    public ValidationTypeConversionException() {
        super("Invalid type. 'hex' and 'roman' are allowed only.");
    }
}
