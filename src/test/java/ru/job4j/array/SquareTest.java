package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {
    @Test
    void whenBound3Then014() {
        int[] result = Square.calculate(3);
        int[] expected = new int[] {0, 1, 4};
        assertThat(result).containsExactly(expected);
    }
    @Test
    void whenBound5Then014() {
        int[] result = Square.calculate(5);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        assertThat(result).containsExactly(expected);
    }

}