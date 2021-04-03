package aqav.learn.dp.strategy;

import java.util.Comparator;

public class Sorter {

    // selection sort as example sorter
    public static <T> void sort(T[] arr, Comparator<T> comparator){
        // comparator is the strategy
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (comparator.compare(arr[min], arr[j]) > 0) {
                    min = j;
                }
            }
            if (min != i) {
                // swap
                T temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
