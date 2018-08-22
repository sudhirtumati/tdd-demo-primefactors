package com.sudhir.samples.tdd;

import com.sudhirt.samples.tdd.PrimeFactors;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(primeFactors.factorsOf(1)).isEmpty();
    }
}
