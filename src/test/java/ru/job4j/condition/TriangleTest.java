package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void when2dot0And2dot0And2dot0ThenTrue() {
        assertThat(Triangle.exist(2.0, 2.0, 2.0)).isTrue();
    }

    @Test
    void when0And2dot0And2dot0ThenFalse() {
        assertThat(Triangle.exist(0, 2.0, 2.0)).isFalse();
    }
}