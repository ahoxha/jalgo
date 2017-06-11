package org.jalgo.sort;

public class QuickSort {

	public void sort(int[] n, int p, int r, SortingOrder order) {
		if (p < r) {
			int q = partition(n, p, r, order);
			sort(n, p, q - 1, order);
			sort(n, q + 1, r, order);
		}
	}

	protected int partition(int[] n, int p, int r, SortingOrder order) {
		int x = n[r];
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
		n[i + 1] = n[r];
		n[r] = temp;
		return i + 1;
	}

}
