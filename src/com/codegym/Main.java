package com.codegym;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1};
        selectSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void bubbleSort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                }
            }
        }
    }

    public static void selectSort(int[] number) {
        for (int i = 0; i < number.length - 1; i++) {
            int min = number[i];
            int temp = i;
            for (int j = i + 1; j < number.length; j++) {
                if (min > number[j]) {
                    min = number[j];
                    temp = j;
                }
            }
            if (temp != i) {
                number[temp] = number[i];
                number[i] = min;
            }
        }

    }
}
