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

    @Test
    public void factorsOf4() {
        assertThat(primeFactors.factorsOf(4)).containsExactly(2, 2);
    }

    @Test
    public void factorsOf5() {
        assertThat(primeFactors.factorsOf(5)).containsExactly(5);
    }

    @Test
    public void factorsOf6() {
        assertThat(primeFactors.factorsOf(6)).containsExactly(2, 3);
    }

    @Test
    public void factorsOf7() {
        assertThat(primeFactors.factorsOf(7)).containsExactly(7);
    }

    @Test
    public void factorsOf8() {
        assertThat(primeFactors.factorsOf(8)).containsExactly(2, 2, 2);
    }

    @Test
    public void factorsOf9() {
        assertThat(primeFactors.factorsOf(9)).containsExactly(3, 3);
    }
}
