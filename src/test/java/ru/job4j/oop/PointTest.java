package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20Then2() {
        double expected = 2;
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10to10Then0() {
        double expected = 0;
        Point a = new Point(1, 0);
        Point b = new Point(1, 0);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to22Then1dot41() {
        double expected = 1.41;
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when22to43Then2dot24() {
        double expected = 2.24;
        Point a = new Point(2, 2);
        Point b = new Point(4, 3);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when942to357Then8dot74() {
        double expected = 7.87;
        Point a = new Point(9, 4, 2);
        Point b = new Point(3, 5, 7);
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when000to123Then3dot74() {
        double expected = 3.74;
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 2, 3);
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when489to729Then6dot70() {
        double expected = 6.70;
        Point a = new Point(4, 8, 9);
        Point b = new Point(7, 2, 9);
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}