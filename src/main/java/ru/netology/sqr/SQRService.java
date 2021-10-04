package ru.netology.sqr;

public class SQRService {
    public int numberSqr(int min, int max) {
        int num = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= min && square <= max) {
                num = num + 1;
            }
        }
        return num;
    }
}

