package org.hoxha.jalgo.sort;

/**
 * 
 * @author armend.hoxha
 *
 */
public class BubbleSort {

	public static void sort(int[] a, SortingOrder order) {
		boolean swapped = false;
		for (int i = 0; i < a.length; i++) {
			swapped = false;
			for (int j = a.length - 1; j > i; j--) {
				if ((order == SortingOrder.ASCENDING && a[j] < a[j - 1])
						|| (order == SortingOrder.DESCENDING && a[j] > a[j - 1])) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}

}
