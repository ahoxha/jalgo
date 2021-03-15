package org.hoxha.jalgo.sort;

import static org.hoxha.jalgo.sort.SortingOrder.ASCENDING;
import static org.hoxha.jalgo.sort.SortingOrder.DESCENDING;

final class MergeSort implements Sort {

    @Override
    public void sortAscending(int[] array) {
        sort(array, 0, array.length - 1, ASCENDING);
    }

    @Override
    public void sortDescending(int[] array) {
        sort(array, 0, array.length - 1, DESCENDING);
    }

    private void sort(int[] array, int p, int r, SortingOrder order) {
        if (p < r) {
            int q = (p + r - 1) / 2;
            sort(array, p, q, order);
            sort(array, q + 1, r, order);
            merge(array, p, q, r, order);
        }
    }

    private void merge(int[] a, int p, int q, int r, SortingOrder order) {
        int[] left = extractLeftSubarray(a, p, q, order);
        int[] right = extractRightSubarray(a, q, r, order);

        int i = 0;
        int j = 0;
        for (int k = p; k <= r; k++) {
            if (order == ASCENDING) {
                if (left[i] <= right[j]) {
                    a[k] = left[i];
                    i++;
                } else {
                    a[k] = right[j];
                    j++;
                }
            } else if (order == SortingOrder.DESCENDING) {
                if (left[i] >= right[j]) {
                    a[k] = left[i];
                    i++;
                } else {
                    a[k] = right[j];
                    j++;
                }
            }
        }
    }

    private int[] extractRightSubarray(int[] array, int q, int r, SortingOrder order) {
        int index = r - q;
        int[] subarray = new int[index + 1];
        setLastElement(subarray, index, order);

        System.arraycopy(array, q + 1, subarray, 0, index);
        return subarray;
    }

    private int[] extractLeftSubarray(int[] array, int p, int q, SortingOrder order) {
        int index = q - p + 1;
        int[] subarray = new int[index + 1];
        setLastElement(subarray, index, order);

        System.arraycopy(array, p, subarray, 0, index);
        return subarray;
    }

    private void setLastElement(int[] array, int index, SortingOrder order) {
        array[index] = order == ASCENDING ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }
}
