package com.sudhirt.samples.tdd;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public List<Integer> factorsOf(Integer number) {
        int remainder = number;
        List<Integer> factors = new ArrayList<>();
        int divisor = 2;
        while (remainder > 1) {
            while (0 == remainder % divisor) {
                factors.add(divisor);
                remainder /= divisor;
            }
            divisor++;
        }
        return factors;
    }
}
