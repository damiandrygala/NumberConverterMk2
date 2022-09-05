package com.dldent.NumberConverter.converters;

import com.dldent.NumberConverter.INumberConvertable;

import java.util.ArrayList;
import java.util.List;

public class NumberToHexConverter implements INumberConvertable {

    @Override
    public String convert(int number) {
        boolean shouldContinue = true;
        List<String> myNumbers = new ArrayList<>();
        int afterModulo;
        var sb = new StringBuilder();

        while (shouldContinue) {
            afterModulo = number % 16;
            myNumbers.add(String.valueOf(afterModulo));
            number /= 16;

            if (number == 0) {
                shouldContinue = false;
            }
        }

        for (int i=myNumbers.size()-1; i>=0; i--) {
            switch (myNumbers.get(i)) {
                case "10" -> myNumbers.set(i, "A");
                case "11" -> myNumbers.set(i, "B");
                case "12" -> myNumbers.set(i, "C");
                case "13" -> myNumbers.set(i, "D");
                case "14" -> myNumbers.set(i, "E");
                case "15" -> myNumbers.set(i, "F");
            }
            sb.append(myNumbers.get(i));
        }
        String result = sb.toString();
        return result;
    }
}
