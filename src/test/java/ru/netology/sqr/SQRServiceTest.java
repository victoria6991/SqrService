package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void shouldCountExampleFromTask() {
        SQRService service = new SQRService();
        int start = 200;
        int end = 300;
        int expected = 3;

        int actual = service.countSquares(start, end);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountWithMaxResults() {
        SQRService service = new SQRService();
        int start = 100;
        int end = 9801;
        int expected = 90;

        int actual = service.countSquares(start, end);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountWithOneResult() {
        SQRService service = new SQRService();
        int start = 9801;
        int end = 20000;
        int expected = 1;

        int actual = service.countSquares(start, end);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountWhenBoundariesTooBigAndOutOfRange() {
        SQRService service = new SQRService();
        int start = 10000;
        int end = 20000;
        int expected = 0;

        int actual = service.countSquares(start, end);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountWhenBoundariesTooSmallAndOutOfRange() {
        SQRService service = new SQRService();
        int start = 0;
        int end = 99;
        int expected = 0;

        int actual = service.countSquares(start, end);

        assertEquals(expected, actual);
    }
}