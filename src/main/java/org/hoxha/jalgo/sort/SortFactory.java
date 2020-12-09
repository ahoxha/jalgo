package org.hoxha.jalgo.sort;

public final class SortFactory {
    private SortFactory() {

    }

    public static Sort insertionSort() {
        return new InsertionSort();
    }

    public static Sort bubbleSort() {
        return new BubbleSort();
    }

    public static Sort mergeSort() {
        return new MergeSort();
    }

    public static Sort quickSort() {
        return new QuickSort();
    }

    public static Sort randomizedQuickSort() {
        return new RandomizedQuickSort();
    }
}
