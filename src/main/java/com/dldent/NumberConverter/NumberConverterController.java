package com.dldent.NumberConverter;

import com.dldent.NumberConverter.exceptions.ConversionException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberConverterController {

    @GetMapping("/convert/{typeOfConvert}/{convertValue}")
    public String convertedValue(@PathVariable int convertValue, @PathVariable String typeOfConvert) {
        try {
            ConvertValueValidator.validate(convertValue);
            var converter = ConverterFactory.Create(typeOfConvert);
            return converter.convert(convertValue);
        } catch (ConversionException e) {
            return e.getMessage();
        }
    }
}
