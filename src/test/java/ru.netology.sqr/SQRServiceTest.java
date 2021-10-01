package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    void shouldNumberSqrIn200To300() {
        SQRService service = new SQRService();
        int min = 200;
        int max = 300;

        int expected = 1;
        int actual = service.numberSqr(min, max);
        assertEquals(expected, actual);


    }

    @Test
    void shouldNumberSqrIn100To600() {
        SQRService service = new SQRService();
        int min = 100;
        int max = 600;

        int expected = 3;
        int actual = service.numberSqr(min, max);
        assertEquals(expected, actual);


    }
}