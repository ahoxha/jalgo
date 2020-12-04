package org.hoxha.jalgo.sort;

public final class QuickSort {

	private QuickSort() {

	}

	public static void sort(int[] array, SortingOrder sortingOrder) {
		sort(array, 0, array.length - 1, sortingOrder);
	}

	private static void sort(int[] n, int p, int r, SortingOrder order) {
		if (p < r) {
			int q = partition(n, p, r, order);
			sort(n, p, q - 1, order);
			sort(n, q + 1, r, order);
		}
	}

	private static int partition(int[] n, int p, int r, SortingOrder order) {
		int i = p - 1;
		for (int j = p; j <= r - 1; j++) {
			if ((order == SortingOrder.ASCENDING && n[j] < n[r]) || (order == SortingOrder.DESCENDING && n[j] > n[r])) {
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
