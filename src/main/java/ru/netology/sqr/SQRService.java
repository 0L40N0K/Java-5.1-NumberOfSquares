package ru.netology.sqr;

public class SQRService {
    public int calculateSqr(int left, int right) {
        int result = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= left & sqr <= right) {
                result++;
            }
        }
        return result;
    }
}
