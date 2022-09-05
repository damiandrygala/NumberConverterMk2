package com.dldent.NumberConverter;

import com.dldent.NumberConverter.converters.NumberToBinConverter;
import com.dldent.NumberConverter.converters.NumberToHexConverter;
import com.dldent.NumberConverter.converters.NumberToOctConverter;
import com.dldent.NumberConverter.converters.NumberToRomanConverter;
import com.dldent.NumberConverter.exceptions.ValidationTypeConversionException;

public class ConverterFactory {

    public static INumberConvertable Create(String typeOfConversion) throws ValidationTypeConversionException {
        switch (typeOfConversion) {
            case "bin" -> {return new NumberToBinConverter();}
            case "oct" -> {return new NumberToOctConverter();}
            case "hex" -> {return new NumberToHexConverter();}
            case "roman" -> {return new NumberToRomanConverter();}
            default -> throw new ValidationTypeConversionException();
        }
    }
}
