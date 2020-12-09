package org.hoxha.jalgo.sort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class QuickSortTest {

    private final Sort sut = new QuickSort();

    @Test
    void testQuickSortAscending() {
        int[] n = { 4, 1, 7, 3 };

        sut.sortAscending(n);

        assertThat(n).isEqualTo(new int[] { 1, 3, 4, 7 });
    }

    @Test
    void testQuickSortAscendingOneElement() {
        int[] n = { 3 };

        sut.sortAscending(n);

        assertThat(n[0]).isEqualTo(3);
    }

    @Test
    void testQuickSortDescending() {
        int[] n = { 4, 1, 7, 3 };

        sut.sortDescending(n);

        assertThat(n).isEqualTo(new int[] { 7, 4, 3, 1 });
    }

    @Test
    void testQuickSortDescendingOneElement() {
        int[] n = { 4 };

        sut.sortAscending(n);

        assertThat(n[0]).isEqualTo(4);
    }

    @Test
    void testRandomizedQuickSortAscending() {
        int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Sort sutRandomized = new RandomizedQuickSort();

        sutRandomized.sortAscending(n);

        assertThat(n[0]).isOne();
        assertThat(n[3]).isEqualTo(4);
        assertThat(n[9]).isEqualTo(10);
    }
}
