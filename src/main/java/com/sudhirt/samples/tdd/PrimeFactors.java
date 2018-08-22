package com.sudhirt.samples.tdd;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public List<Integer> factorsOf(Integer number) {
        List<Integer> factors = new ArrayList<>();
        if (number > 1) {
            while (0 == number % 2) {
                factors.add(2);
                number /= 2;
            }
        }
        if (number > 1) {
            factors.add(number);
        }
        return factors;
    }
}
