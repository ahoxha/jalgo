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
                if (shouldElementsBeSwapped(array[j - 1], array[j], order)) {
                    swapElements(array, j);
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
                if (shouldElementsBeSwapped(array[j - 1], array[j], order)) {
                    swapElements(array, j);
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
                if (shouldElementsBeSwapped(list.get(j - 1), list.get(j), order)) {
                    swapElements(list, j);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    private <T extends Comparable<T>> boolean shouldElementsBeSwapped(T previous, T current, SortingOrder order) {
        return shouldElementsBeSwapped(0, current.compareTo(previous), order);
    }

    private boolean shouldElementsBeSwapped(int previous, int current, SortingOrder order) {
        return (order == ASCENDING && current < previous) || (order == DESCENDING && current > previous);
    }

    private void swapElements(int[] array, int currentIndex) {
        int temp = array[currentIndex];
        array[currentIndex] = array[currentIndex - 1];
        array[currentIndex - 1] = temp;
    }

    private <T extends Comparable<T>> void swapElements(T[] array, int currentIndex) {
        T temp = array[currentIndex];
        array[currentIndex] = array[currentIndex - 1];
        array[currentIndex - 1] = temp;
    }

    private <T extends Comparable<T>> void swapElements(List<T> list, int currentIndex) {
        T temp = list.get(currentIndex);
        list.set(currentIndex, list.get(currentIndex - 1));
        list.set(currentIndex - 1, temp);
    }
}
