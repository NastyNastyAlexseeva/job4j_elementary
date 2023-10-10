package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double result = Fit.manWeight(in);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double result = Fit.womanWeight(in);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}