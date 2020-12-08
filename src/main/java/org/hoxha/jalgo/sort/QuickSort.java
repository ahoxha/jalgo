package org.hoxha.jalgo.sort;

import static org.hoxha.jalgo.sort.SortingOrder.ASCENDING;
import static org.hoxha.jalgo.sort.SortingOrder.DESCENDING;

class QuickSort implements Sort {

    @Override
    public void sortAscending(int[] array) {
        sort(array, 0, array.length - 1, ASCENDING);
    }

    @Override
    public void sortDescending(int[] array) {
        sort(array, 0, array.length - 1, DESCENDING);
    }

    protected void sort(int[] n, int p, int r, SortingOrder order) {
        if (p < r) {
            int q = partition(n, p, r, order);
            sort(n, p, q - 1, order);
            sort(n, q + 1, r, order);
        }
    }

    protected int partition(int[] n, int p, int r, SortingOrder order) {
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if ((order == ASCENDING && n[j] < n[r]) || (order == SortingOrder.DESCENDING && n[j] > n[r])) {
                i = i + 1;
                int temp = n[i];
                n[i] = n[j];
                n[j] = temp;
            }
        }
        int temp = n[i + 1];
        n[i + 1] = n[r];
        n[r] = temp;
        return i + 1;
    }
}
