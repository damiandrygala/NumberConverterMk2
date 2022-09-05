package com.dldent.NumberConverter.converters;

import com.dldent.NumberConverter.INumberConvertable;

import java.util.ArrayList;
import java.util.List;

public class NumberToBinConverter implements INumberConvertable {

    @Override
    public String convert (int number) {
        boolean shouldContinue = true;
        List<String> myNumbers = new ArrayList<>();
        int afterModulo;
        var sb = new StringBuilder();

        while (shouldContinue) {
            afterModulo = number % 2;
            myNumbers.add(String.valueOf(afterModulo));
            number /= 2;

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
