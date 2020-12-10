package org.hoxha.jalgo.sort;

import static org.hoxha.jalgo.sort.SortingOrder.ASCENDING;
import static org.hoxha.jalgo.sort.SortingOrder.DESCENDING;

import java.util.List;

final class BubbleSort implements Sort {
    @Override
    public void sortAscending(int[] array) {
        sort(array, ASCENDING);
    }

    @Override
    public void sortDescending(int[] array) {
        sort(array, DESCENDING);
    }

    @Override
    public <T extends Comparable<T>> void sortAscending(T[] array) {
        sort(array, ASCENDING);
    }

    @Override
    public <T extends Comparable<T>> void sortDescending(T[] array) {
        sort(array, DESCENDING);
    }

    @Override
    public <T extends Comparable<T>> void sortAscending(List<T> list) {
        sort(list, ASCENDING);
    }

    @Override
    public <T extends Comparable<T>> void sortDescending(List<T> list) {
        sort(list, DESCENDING);
    }

    private void sort(int[] array, SortingOrder order) {
        boolean swapped;
        for (int i = 0; i < array.length; i++) {
            swapped = false;
            for (int j = array.length - 1; j > i; j--) {
                if ((order == ASCENDING && array[j] < array[j - 1]) || (order == DESCENDING && array[j] > array[j - 1])) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    private <T extends Comparable<T>> void sort(T[] array, SortingOrder order) {
        boolean swapped;
        for (int i = 0; i < array.length; i++) {
            swapped = false;
            for (int j = array.length - 1; j > i; j--) {
                if ((order == ASCENDING && array[j].compareTo(array[j - 1]) < 0) || (order == DESCENDING && array[j].compareTo(array[j - 1]) > 0)) {
                    T temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    private <T extends Comparable<T>> void sort(List<T> list, SortingOrder order) {
        boolean swapped;
        for (int i = 0; i < list.size(); i++) {
            swapped = false;
            for (int j = list.size() - 1; j > i; j--) {
                if ((order == ASCENDING && list.get(j).compareTo(list.get(j - 1)) < 0) || (order == DESCENDING && list.get(j).compareTo(list.get(j - 1)) > 0)) {
                    T temp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
