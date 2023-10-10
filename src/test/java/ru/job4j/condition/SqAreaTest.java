package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Square2() {
        double expected = 2;
        double result = SqArea.square(6, 2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP4K1Square1() {
        double expected = 1;
        double result = SqArea.square(4, 1);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP2K3Square0Dot18() {
        double expected = 0.18;
        double result = SqArea.square(2, 3);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}