package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int result = Counter.sumByEven(1, 10);
        assertThat(result).isEqualTo(30);
    }

    @Test
    void whenSumEvenNumbersFrom3To8Then18() {
        int result = Counter.sumByEven(3, 8);
        assertThat(result).isEqualTo(18);
    }

}