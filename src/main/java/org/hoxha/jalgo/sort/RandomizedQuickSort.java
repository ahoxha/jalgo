package org.hoxha.jalgo.sort;

import java.util.Random;

public class RandomizedQuickSort {
	Random rand;

	public RandomizedQuickSort() {
		rand = new Random();
	}

	public void sort(int[] n, int p, int r, SortingOrder order) {
		if (p < r) {
			int q = partition(n, p, r, order);
			sort(n, p, q - 1, order);
			sort(n, q + 1, r, order);
		}
	}

	protected int partition(int[] n, int p, int r, SortingOrder order) {
		int pivot = rand.nextInt(r - p + 1) + p;
		int x = n[pivot];
		int i = p - 1;
		for (int j = p; j <= r - 1; j++) {
			if ((order == SortingOrder.ASCENDING && n[j] < x) || (order == SortingOrder.DESCENDING && n[j] > x)) {
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
