package org.hoxha.jalgo.sort;

import java.util.List;

/**
 * 
 * @author armend.hoxha
 *
 */
public class InsertionSort {

	/**
	 * Sorts an array of integers using the insertion sort algorithm. Depending on
	 * the 'order' parameter, it sorts the array in Ascending or Descending order.
	 * 
	 * @param a
	 *            the array to be sorted.
	 * @param order
	 *            the order in which the array 'a' will be sorted. Possible values:
	 *            SortingOrder.ASCENDING or SortingOrder.DESCENDING.
	 */
	public static void sort(int[] a, SortingOrder order) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if ((order == SortingOrder.ASCENDING && a[i] < a[j])
						|| (order == SortingOrder.DESCENDING && a[i] > a[j])) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i = j;
				}
			}
		}
	}

	public static <T extends Comparable<T>> void sort(List<T> a, SortingOrder order) {
		for (int i = 1; i < a.size(); i++) {
			for (int j = i - 1; j >= 0; j--) {
				if ((order == SortingOrder.ASCENDING && a.get(i).compareTo(a.get(j)) < 0)
						|| (order == SortingOrder.DESCENDING && a.get(i).compareTo(a.get(j)) > 0)) {
					T temp = a.get(i);
					a.set(i, a.get(j));
					a.set(j, temp);
					i = j;
				}
			}
		}
	}

	public static <T extends Comparable<T>> void sort(T[] a, SortingOrder order) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if ((order == SortingOrder.ASCENDING && a[i].compareTo(a[j]) < 0)
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
