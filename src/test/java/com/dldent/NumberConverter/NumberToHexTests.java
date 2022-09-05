package com.dldent.NumberConverter;

import com.dldent.NumberConverter.converters.NumberToHexConverter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class NumberToHexTests {

    @Test
    public void IfParamsAreCorrect_TryConvertToHex_ShouldPass() {
        var converter = new NumberToHexConverter();
        var result = converter.convert(1023);
        assertEquals("3FF", result);
    }

    @Test
    public void IfParamsAreWrong_TryConvertToHex_ShouldFail() {
        var converter = new NumberToHexConverter();
        var result = converter.convert(1023);
        assertNotEquals("FF3", result);
    }
}
