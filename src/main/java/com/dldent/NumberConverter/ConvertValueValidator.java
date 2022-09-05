package com.dldent.NumberConverter;

import com.dldent.NumberConverter.exceptions.ValidationNumberConversionException;

public class ConvertValueValidator {
    public static void validate(int convertValue) throws ValidationNumberConversionException {
        if ((convertValue < 1) || (convertValue > 3999)) {
            throw new ValidationNumberConversionException(convertValue);
        }
    }
}
