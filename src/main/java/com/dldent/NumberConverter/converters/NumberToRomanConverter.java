package com.dldent.NumberConverter.converters;

import com.dldent.NumberConverter.INumberConvertable;

public class NumberToRomanConverter implements INumberConvertable {

    @Override
    public String convert(int number) {

        boolean shouldContinue = true;
        int romanValues[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String romanCharacters[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int valueToConvert = number;
        var sb = new StringBuilder();

        int idx = 0;

        while (shouldContinue) {
            if (valueToConvert >= romanValues[idx]) {
                sb.append(romanCharacters[idx]);
                valueToConvert-=romanValues[idx];
            } else {
                if (idx==(romanValues.length)-1) break;
                idx++;
            }
            if (valueToConvert == 0) {
                shouldContinue = false;
            }
        }
        String result = sb.toString();
        return result;
    }
}
