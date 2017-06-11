package org.jalgo.sort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QuickSortTest {
	@Test
	public void testQuickSortAscending() {
		int[] n = { 4, 1, 7, 3 };
		QuickSort qs = new QuickSort();
		qs.sort(n, 0, n.length - 1, SortingOrder.ASCENDING);
		assertEquals("Wrong value.", 1, n[0]);
		assertEquals("Wrong value.", 3, n[1]);
		assertEquals("Wrong value.", 4, n[2]);
		assertEquals("Wrong value.", 7, n[3]);
	}

	@Test
	public void testQuickSortAscendingOneElement() {
		int[] n = { 3 };
		QuickSort qs = new QuickSort();
		qs.sort(n, 0, n.length - 1, SortingOrder.ASCENDING);
		assertEquals("Wrong value.", 3, n[0]);
	}

	@Test
	public void testQuickSortDescending() {
		int[] n = { 4, 1, 7, 3 };
		QuickSort qs = new QuickSort();
		qs.sort(n, 0, n.length - 1, SortingOrder.DESCENDING);
		assertEquals("Wrong value.", 7, n[0]);
		assertEquals("Wrong value.", 4, n[1]);
		assertEquals("Wrong value.", 3, n[2]);
		assertEquals("Wrong value.", 1, n[3]);
	}

	@Test
	public void testQuickSortDescendingOneElement() {
		int[] n = { 4 };
		QuickSort qs = new QuickSort();
		qs.sort(n, 0, n.length - 1, SortingOrder.DESCENDING);
		assertEquals("Wrong value.", 4, n[0]);
	}

	@Test
	public void testRandomizedQuickSortAscending() {
		int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		RandomizedQuickSort rqs = new RandomizedQuickSort();
		rqs.sort(n, 0, n.length - 1, SortingOrder.ASCENDING);
		assertEquals("Wrong value", 1, n[0]);
		assertEquals("Wrong value", 4, n[3]);
		assertEquals("Wrong value", 10, n[9]);
	}
}
