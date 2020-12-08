package org.hoxha.jalgo.sort;

import java.util.Random;

final class RandomizedQuickSort extends QuickSort {
	private static final Random rand = new Random();

	@Override
	protected int partition(int[] n, int p, int r, SortingOrder order) {
		int pivot = rand.nextInt(r - p + 1) + p;
		int i = p - 1;
		for (int j = p; j <= r - 1; j++) {
			if ((order == SortingOrder.ASCENDING && n[j] < n[pivot]) || (order == SortingOrder.DESCENDING && n[j] > n[pivot])) {
				i = i + 1;
				int temp = n[i];
				n[i] = n[j];
				n[j] = temp;
			}
		}
		int temp = n[i + 1];
		n[i + 1] = n[pivot];
		n[pivot] = temp;
		return i + 1;
	}
}
