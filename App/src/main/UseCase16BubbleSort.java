package main;

import java.util.*;

public class UseCase16BubbleSort {

    public int[] bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] capacities = {72, 56, 24, 70, 60};

        UseCase16BubbleSort app = new UseCase16BubbleSort();

        int[] sorted = app.bubbleSort(capacities);

        System.out.println("Sorted Capacities: " + Arrays.toString(sorted));
    }
}