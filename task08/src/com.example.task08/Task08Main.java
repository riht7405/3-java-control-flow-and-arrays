package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        int[] myArray = new int[4];
        myArray[0] = 2;
        myArray[1] = 10;
        myArray[2] = 10;
        myArray[3] = 0;
        System.out.println(mult(myArray));
    }

    static long mult(int[] arr) {
        // Обрабатываем случай пустого массива
        if (arr.length == 0) {
            return 0;
        }

        // Используем long для больших произведений
        long total = 1;
        for (int i = 0; i < arr.length; i++) {
            total *= arr[i];
        }
        return total;
    }
}