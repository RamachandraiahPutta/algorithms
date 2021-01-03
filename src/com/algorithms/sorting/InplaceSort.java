package com.algorithms.sorting;

public interface InplaceSort {

    public void sort(int[] values);

    default void swap(int[] values, int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }
}
