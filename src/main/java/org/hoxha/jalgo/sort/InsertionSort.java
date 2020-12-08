package org.hoxha.jalgo.sort;

import static org.hoxha.jalgo.sort.SortingOrder.ASCENDING;
import static org.hoxha.jalgo.sort.SortingOrder.DESCENDING;

import java.util.List;

final class InsertionSort implements Sort {

	@Override
	public void sortAscending(int[] array) {
		sort(array, ASCENDING);
	}

	@Override
	public void sortDescending(int[] array) {
		sort(array, DESCENDING);
	}

	@Override
	public <T extends Comparable<T>> void sortAscending(List<T> list) {
		sort(list, ASCENDING);
	}

	@Override
	public <T extends Comparable<T>> void sortAscending(T[] array) {
		sort(array, ASCENDING);
	}

	public <T extends Comparable<T>> void sortDescending(List<T> list) {
		sort(list, DESCENDING);
	}

	private void sort(int[] a, SortingOrder order) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if ((order == ASCENDING && a[i] < a[j])
						|| (order == SortingOrder.DESCENDING && a[i] > a[j])) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i = j;
				}
			}
		}
	}

	private <T extends Comparable<T>> void sort(List<T> a, SortingOrder order) {
		for (int i = 1; i < a.size(); i++) {
			for (int j = i - 1; j >= 0; j--) {
				if ((order == ASCENDING && a.get(i).compareTo(a.get(j)) < 0)
						|| (order == SortingOrder.DESCENDING && a.get(i).compareTo(a.get(j)) > 0)) {
					T temp = a.get(i);
					a.set(i, a.get(j));
					a.set(j, temp);
					i = j;
				}
			}
		}
	}

	private <T extends Comparable<T>> void sort(T[] a, SortingOrder order) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if ((order == ASCENDING && a[i].compareTo(a[j]) < 0)
						|| (order == SortingOrder.DESCENDING && a[i].compareTo(a[j]) > 0)) {
					T temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i = j;
				}
			}
		}
	}
}
