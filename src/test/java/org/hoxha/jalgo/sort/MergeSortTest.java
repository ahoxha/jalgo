package org.hoxha.jalgo.sort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class MergeSortTest {

    private final Sort sut = SortFactory.mergeSort();

    @Test
    void testArrayWithEvenNumberOfElementsAscending() {
        int[] array = { 5, 3, 8, 1 };

        sut.sortAscending(array);

        assertThat(array).isEqualTo(new int[] { 1, 3, 5, 8 });
    }

    @Test
    void testArrayWithOddNumberOfElementsAscending() {
        int[] array = { 1, 3, 4 };

        sut.sortAscending(array);

        assertThat(array).isEqualTo(new int[] { 1, 3, 4 });
    }

    @Test
    void testOneElementArrayAscending() {
        int[] array = { 1 };

        sut.sortAscending(array);

        assertThat(array[0]).isOne();
    }

    @Test
    void testOneElementArrayDescending() {
        int[] array = { 3 };

        sut.sortDescending(array);

        assertThat(array[0]).isEqualTo(3);
    }

    @Test
    void testArrayWithEvenNumberOfElementsDescending() {
        int[] array = { 1, 3, 4 };

        sut.sortDescending(array);

        assertThat(array).isEqualTo(new int[] { 4, 3, 1 });
    }
}
