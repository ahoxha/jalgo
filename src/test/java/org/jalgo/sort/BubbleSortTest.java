package org.jalgo.sort;

import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {

	@Test
	public void testArrayAscending() {
		int[] a = { 3, 1, 8 };
		BubbleSort.sort(a, SortingOrder.ASCENDING);
		assertEquals("Wrong value.", 1, a[0]);
		assertEquals("Wrong value.", 3, a[1]);
		assertEquals("Wrong value.", 8, a[2]);
	}
	
	@Test
	public void testArrayDescending(){
		int[] a = {3,1,8};
		BubbleSort.sort(a, SortingOrder.DESCENDING);
		assertEquals("Wrong value.", 8, a[0]);
		assertEquals("Wrong value.", 3, a[1]);
		assertEquals("Wrong value.", 1, a[2]);
	}
}
