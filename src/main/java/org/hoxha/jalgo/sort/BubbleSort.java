package org.hoxha.jalgo.sort;

import static org.hoxha.jalgo.sort.SortingOrder.ASCENDING;
import static org.hoxha.jalgo.sort.SortingOrder.DESCENDING;

final class BubbleSort implements Sort{
	@Override
	public void sortAscending(int[] array) {
		sort(array, ASCENDING);
	}

	@Override
	public void sortDescending(int[] array) {
		sort(array, DESCENDING);
	}

	private void sort(int[] a, SortingOrder order) {
		boolean swapped = false;
		for (int i = 0; i < a.length; i++) {
			swapped = false;
			for (int j = a.length - 1; j > i; j--) {
				if ((order == ASCENDING && a[j] < a[j - 1])
						|| (order == DESCENDING && a[j] > a[j - 1])) {
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
