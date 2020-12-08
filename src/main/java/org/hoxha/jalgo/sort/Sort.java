package org.hoxha.jalgo.sort;

import java.util.List;

public interface Sort {
    void sortAscending(int[] array);

    void sortDescending(int[] array);

    default <T extends Comparable<T>> void sortAscending(List<T> list) {
        throw new UnsupportedOperationException("This method is not supported yet.");
    }

    default <T extends Comparable<T>> void sortDescending(List<T> list) {
        throw new UnsupportedOperationException("This method is not supported yet.");
    }

    default <T extends Comparable<T>> void sortAscending(T[] array) {
        throw new UnsupportedOperationException("This method is not supported yet.");
    }

    default <T extends Comparable<T>> void sortDescending(T[] array) {
        throw new UnsupportedOperationException("This method is not supported yet.");
    }
}
