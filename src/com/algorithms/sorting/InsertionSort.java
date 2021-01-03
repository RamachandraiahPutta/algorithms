package com.algorithms.sorting;

import java.util.Arrays;
import java.util.Objects;

public class InsertionSort implements InplaceSort {

    @Override
    public void sort(int[] values) {
        if (Objects.isNull(values)) {
            return;
        }
        int length = values.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (values[j] < values[j - 1])
                    swap(values, j - 1, j);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 8, 13, 2, 3};
        InsertionSort sorter = new InsertionSort();
        sorter.sort(array);
        // Prints:
        // [2, 3, 4, 6, 8, 10, 13]
        System.out.println(Arrays.toString(array));
    }
}
