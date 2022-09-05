package com.dldent.NumberConverter;

import com.dldent.NumberConverter.converters.NumberToBinConverter;
import com.dldent.NumberConverter.converters.NumberToHexConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NumberToBinTests {

    @Test
    public void IfParamsAreCorrect_TryConvertToBin_ShouldPass() {
        var converter = new NumberToBinConverter();
        var result = converter.convert(1023);
        assertEquals("1111111111", result);
    }

    @Test
    public void IfParamsAreWrong_TryConvertToBin_ShouldFail() {
        var converter = new NumberToBinConverter();
        var result = converter.convert(1023);
        assertNotEquals("0000000000", result);
    }

}
