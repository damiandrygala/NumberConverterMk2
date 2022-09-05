package com.dldent.NumberConverter;

import com.dldent.NumberConverter.exceptions.ConversionException;
import com.dldent.NumberConverter.exceptions.ValidationNumberConversionException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ConvertValueValidatorTests {

    @Test
    public void IfNumberIsCorrect_ShouldPass() throws ValidationNumberConversionException {
        ConvertValueValidator.validate(44);
        assertTrue(true);
    }

    @Test
    public void IfNumberIs0_ShouldFail() {
        try {
            ConvertValueValidator.validate(0);
        } catch (ConversionException e) {
            assertFalse(false);
        }
    }

    @Test
    public void IfNumberIsHigherThan3999_ShouldFail() {
        try {
            ConvertValueValidator.validate(4001);
        } catch (ConversionException e) {
            assertFalse(false);
        }
    }
}
