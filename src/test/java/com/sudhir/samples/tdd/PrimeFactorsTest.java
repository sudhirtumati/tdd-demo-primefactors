package com.sudhir.samples.tdd;

import com.sudhirt.samples.tdd.PrimeFactors;
import org.junit.jupiter.api.Test;

public class PrimeFactorsTest {

    @Test
    public void nothing() {
    }

    @Test
    public void createsInstance() {
        PrimeFactors primeFactors = new PrimeFactors();
    }

    @Test
    public void factorsOf1() {
        PrimeFactors primeFactors = new PrimeFactors();
        primeFactors.factorsOf(1);
    }
}
