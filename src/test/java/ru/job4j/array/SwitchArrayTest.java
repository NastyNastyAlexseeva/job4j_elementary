package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] result = SwitchArray.swap(input, 0, input.length - 1);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to3() {
        int[] input = {1, 2, 3, 4};
        int[] result = SwitchArray.swap(input, 2, 3);
        int[] expected = {1, 2, 4, 3};
        assertThat(result).containsExactly(expected);
    }
}