package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        assertThat(Max.max(1, 2)).isEqualTo(2);
    }

    @Test
    void whenMax2To1Then2() {
        assertThat(Max.max(2, 1)).isEqualTo(2);
    }

    @Test
    void whenMax2To2Then2() {
        assertThat(Max.max(2, 2)).isEqualTo(2);
    }
}