package org.hoxha.jalgo.sort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

    private final Sort sut = new BubbleSort();

    @Test
    void testArrayAscending() {
        int[] a = { 3, 1, 8 };

        sut.sortAscending(a);

        assertThat(a).isEqualTo(new int[] { 1, 3, 8 });
    }

    @Test
    void testArrayDescending() {
        int[] a = { 3, 1, 8 };
        sut.sortDescending(a);

        assertThat(a).isEqualTo(new int[] { 8, 3, 1 });
    }
}
