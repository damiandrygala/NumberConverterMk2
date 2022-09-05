package com.dldent.NumberConverter.converters;

import com.dldent.NumberConverter.INumberConvertable;

import java.util.ArrayList;
import java.util.List;

public class NumberToOctConverter implements INumberConvertable {

    @Override
    public String convert(int number) {
        boolean shouldContinue = true;
        List<String> myNumbers = new ArrayList<>();
        int afterModulo;
        var sb = new StringBuilder();

        while (shouldContinue) {
            afterModulo = number % 8;
            myNumbers.add(String.valueOf(afterModulo));
            number /= 8;

            if (number == 0) {
                shouldContinue = false;
            }
        }

        for (int i=myNumbers.size()-1; i>=0; i--) {
            sb.append(myNumbers.get(i));
        }
        String result = sb.toString();
        return result;
    }
}
