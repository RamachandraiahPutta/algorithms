package com.algorithms.sorting;

import java.util.Arrays;
import java.util.Objects;

public class SelectionSort implements InplaceSort {

    @Override
    public void sort(int[] values) {
        if (Objects.isNull(values)) {
            return;
        }
        int length = values.length;
        for (int i = 0; i < length; i++) {
            // Find the index beyond i with a lower value than i
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (values[j] < values[minIndex]) {
                    minIndex = j;
                }
            }
            swap(values, i, minIndex);
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 8, 13, 2, 3};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(array);
        // Prints:
        // [2, 3, 4, 6, 8, 10, 13]
        System.out.println(Arrays.toString(array));
    }
}
