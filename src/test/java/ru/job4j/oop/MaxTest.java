package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax5To4To6Then6() {
        int left = 5;
        int right = 4;
        int first = 6;
        int result = Max.max(left, right, first);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To4To3Then7() {
        int left = 7;
        int right = 4;
        int first = 3;
        int result = Max.max(left, right, first);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To6To8To4Then8() {
        int left = 7;
        int right = 6;
        int first = 8;
        int second = 4;
        int result = Max.max(left, right, first, second);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To2To2To8Then8() {
        int left = 5;
        int right = 2;
        int first = 2;
        int second = 8;
        int result = Max.max(left, right, first, second);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }
}