package com.dldent.NumberConverter;

import com.dldent.NumberConverter.converters.NumberToHexConverter;
import com.dldent.NumberConverter.converters.NumberToOctConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NumberToOctTests {

    @Test
    public void IfParamsAreCorrect_TryConvertToHex_ShouldPass() {
        var converter = new NumberToOctConverter();
        var result = converter.convert(1023);
        assertEquals("1777", result);
    }

    @Test
    public void IfParamsAreWrong_TryConvertToHex_ShouldFail() {
        var converter = new NumberToOctConverter();
        var result = converter.convert(1023);
        assertNotEquals("7771", result);
    }
}
