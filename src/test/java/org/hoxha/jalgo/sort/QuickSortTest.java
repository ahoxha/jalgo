package org.hoxha.jalgo.sort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class QuickSortTest {
    @Test
    void testQuickSortAscending() {
        int[] n = { 4, 1, 7, 3 };

        QuickSort.sort(n, 0, n.length - 1, SortingOrder.ASCENDING);

        assertThat(n).isEqualTo(new int[] { 1, 3, 4, 7 });
    }

    @Test
    void testQuickSortAscendingOneElement() {
        int[] n = { 3 };

        QuickSort.sort(n, 0, n.length - 1, SortingOrder.ASCENDING);

        assertThat(n[0]).isEqualTo(3);
    }

    @Test
    void testQuickSortDescending() {
        int[] n = { 4, 1, 7, 3 };

        QuickSort.sort(n, 0, n.length - 1, SortingOrder.DESCENDING);

        assertThat(n).isEqualTo(new int[] { 7, 4, 3, 1 });
    }

    @Test
    void testQuickSortDescendingOneElement() {
        int[] n = { 4 };

        QuickSort.sort(n, 0, n.length - 1, SortingOrder.DESCENDING);

        assertThat(n[0]).isEqualTo(4);
    }

    @Test
    void testRandomizedQuickSortAscending() {
        int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        RandomizedQuickSort.sort(n, 0, n.length - 1, SortingOrder.ASCENDING);

        assertThat(n[0]).isOne();
        assertThat(n[3]).isEqualTo(4);
        assertThat(n[9]).isEqualTo(10);
    }
}
