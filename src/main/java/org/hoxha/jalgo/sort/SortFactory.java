package org.hoxha.jalgo.sort;

public final class SortFactory {
    private SortFactory() {

    }

    public static Sort insertionSort() {
        return new InsertionSort();
    }
}
