package com.sudhir.samples.tdd;

import com.sudhirt.samples.tdd.PrimeFactors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorsTest {

    PrimeFactors primeFactors;

    @BeforeEach
    public void initialize() {
        primeFactors = new PrimeFactors();
    }

    @Test
    public void factorsOf1() {
        assertThat(primeFactors.factorsOf(1)).isEmpty();
    }

    @Test
    public void factorsOf2() {
        assertThat(primeFactors.factorsOf(2)).containsExactly(2);
    }

    @Test
    public void factorsOf3() {
        assertThat(primeFactors.factorsOf(3)).containsExactly(3);
    }
}
