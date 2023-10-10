package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        double result = Point.distance(0, 0, 2, 0);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when01to20then223() {
        double expected = 2.23;
        double result = Point.distance(0, 1, 2, 0);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to21then1() {
        double expected = 1;
        double result = Point.distance(1, 1, 2, 1);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

}