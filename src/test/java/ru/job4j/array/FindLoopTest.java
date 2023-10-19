package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int result = FindLoop.indexOf(data, 5);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {5, 2, 3};
        int result = FindLoop.indexOf(data, 10);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void whenArrayHasNot3Then2() {
        int[] data = new int[] {5, 10, 3};
        int result = FindLoop.indexOf(data, 3);
        assertThat(result).isEqualTo(2);
    }
}