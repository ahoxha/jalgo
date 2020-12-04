package org.hoxha.jalgo.sort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void testArrayAscending() {
        int[] a = { 3, 1, 8 };

        BubbleSort.sort(a, SortingOrder.ASCENDING);

        assertThat(a).isEqualTo(new int[] { 1, 3, 8 });
    }

    @Test
    void testArrayDescending() {
        int[] a = { 3, 1, 8 };
        BubbleSort.sort(a, SortingOrder.DESCENDING);

        assertThat(a).isEqualTo(new int[] { 8, 3, 1 });
    }
}
