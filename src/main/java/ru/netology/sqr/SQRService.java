package ru.netology.sqr;

public class SQRService {

    public static int countSquares(int start, int end) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= start & i * i <= end) {
                counter ++;
            }
        }
        return (counter);
    }
}
