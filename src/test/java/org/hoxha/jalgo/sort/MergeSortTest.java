package org.hoxha.jalgo.sort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MergeSortTest {
	@Test
	public void testArrayEvenElementsAscending() {
		int[] a = { 5, 3, 8, 1 };
		MergeSort.sort(a, 0, a.length - 1, SortingOrder.ASCENDING);
		assertEquals("Wrong value.", 1, a[0]);
		assertEquals("Wrong value.", 3, a[1]);
		assertEquals("Wrong value.", 5, a[2]);
		assertEquals("Wrong value.", 8, a[3]);
	}

	@Test
	public void testArrayOddElementsAscending() {
		int[] a = { 1, 3, 4 };
		MergeSort.sort(a, 0, a.length - 1, SortingOrder.ASCENDING);
		assertEquals("Wrong value.", 1, a[0]);
		assertEquals("Wrong value", 3, a[1]);
		assertEquals("Wrong value.", 4, a[2]);
	}

	@Test
	public void testOneElementArrayAscending() {
		int[] a = { 1 };
		MergeSort.sort(a, 0, a.length - 1, SortingOrder.ASCENDING);
		assertEquals("Wrong value.", 1, a[0]);
	}

	@Test
	public void testArrayEvenElementsDescending() {
		int[] a = { 1, 3, 4 };
		MergeSort.sort(a, 0, a.length - 1, SortingOrder.DESCENDING);
		assertEquals("Wrong value.", 4, a[0]);
		assertEquals("Wrong value.", 3, a[1]);
		assertEquals("Wrong value.", 1, a[2]);
	}

/*	@Test
	public void testListEvenElementsAscending() {

	}*/
}
