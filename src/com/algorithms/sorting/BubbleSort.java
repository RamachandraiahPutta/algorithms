package com.algorithms.sorting;

import java.util.Arrays;
import java.util.Objects;

public class BubbleSort implements InplaceSort {

    // Sort the array using bubble sort. The idea behind
    // bubble sort is to look for adjacent indexes which
    // are out of place and interchange their elements
    // until the entire array is sorted.
    @Override
    public void sort(int[] values) {
        if (Objects.isNull(values)) {
            return;
        }
        int length = values.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - i; j++) {
                if (values[j] < values[j-1])
                    swap(values, j, j-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 8, 13, 2, 3};
        BubbleSort sorter = new BubbleSort();
        sorter.sort(array);
        // Prints:
        // [2, 3, 4, 6, 8, 10, 13]
        System.out.println(Arrays.toString(array));
    }
}
