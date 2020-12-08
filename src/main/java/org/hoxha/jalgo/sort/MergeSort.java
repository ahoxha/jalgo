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

    private void sort(int[] a, int p, int r, SortingOrder order) {
        if (p < r) {
            int q = (p + r - 1) / 2;
            sort(a, p, q, order);
            sort(a, q + 1, r, order);
            merge(a, p, q, r, order);
        }
    }

    private void merge(int[] a, int p, int q, int r, SortingOrder order) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];
        for (int i = 0; i < n1; i++) {
            left[i] = a[i + p];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = a[i + q + 1];
        }
        left[n1] = order == ASCENDING ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        right[n2] = order == ASCENDING ? Integer.MAX_VALUE : Integer.MIN_VALUE;
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
}
