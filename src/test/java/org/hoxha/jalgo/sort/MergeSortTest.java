package org.hoxha.jalgo.sort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class MergeSortTest {
    @Test
    void testArrayEvenElementsAscending() {
        int[] a = { 5, 3, 8, 1 };

        MergeSort.sort(a, 0, a.length - 1, SortingOrder.ASCENDING);

        assertThat(a).isEqualTo(new int[] { 1, 3, 5, 8 });
    }

    @Test
    void testArrayOddElementsAscending() {
        int[] a = { 1, 3, 4 };

        MergeSort.sort(a, 0, a.length - 1, SortingOrder.ASCENDING);

        assertThat(a).isEqualTo(new int[] { 1, 3, 4 });
    }

    @Test
    void testOneElementArrayAscending() {
        int[] a = { 1 };

        MergeSort.sort(a, 0, a.length - 1, SortingOrder.ASCENDING);

        assertThat(a[0]).isOne();
    }

    @Test
    void testArrayEvenElementsDescending() {
        int[] a = { 1, 3, 4 };

        MergeSort.sort(a, 0, a.length - 1, SortingOrder.DESCENDING);

        assertThat(a).isEqualTo(new int[] { 4, 3, 1 });
    }

/*	@Test
	void testListEvenElementsAscending() {

	}*/
}
