package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {
    @Test
    void whenCalculateFactorialFor5Then120() {
        int out = Factorial.calc(5);
        assertThat(out).isEqualTo(120);
    }

    @Test
    void whenCalculateFactorialFor1Then1() {
        int out = Factorial.calc(1);
        assertThat(out).isEqualTo(1);
    }

    @Test
    void whenCalculateFactorialFor0Then1() {
        int out = Factorial.calc(0);
        assertThat(out).isEqualTo(1);
    }

}