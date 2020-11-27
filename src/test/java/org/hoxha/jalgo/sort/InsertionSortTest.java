package org.hoxha.jalgo.sort;

import org.hoxha.jalgo.sort.model.Student;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortTest {

	@Test
	public void testArraySortAscendingPasses() {
		int[] a = { 5, 3, 1 };
		InsertionSort.sort(a, SortingOrder.ASCENDING);
		assertEquals("Wrong value.", 1, a[0]);
		assertEquals("Wrong value.", 3, a[1]);
		assertEquals("Wrong value.", 5, a[2]);
	}

	@Test
	public void testArrayWithOneElementSortAcendingPasses() {
		int[] a = { 1 };
		InsertionSort.sort(a, SortingOrder.ASCENDING);
		assertEquals("Wrong value", 1, a[0]);
	}

	@Test
	public void testEmptyArraySortAscendingPasses() {
		try {
			int[] a = new int[0];
			InsertionSort.sort(a, SortingOrder.ASCENDING);
			assertTrue(true);
		} catch (ArrayIndexOutOfBoundsException ex) {
			fail(ex.getMessage());
		}
	}

	@Test
	public void testArraySortDescendingPasses() {
		int[] a = { 1, 8, 2 };
		InsertionSort.sort(a, SortingOrder.DESCENDING);
		assertEquals("Wrong value.", 8, a[0]);
		assertEquals("Wrong value.", 2, a[1]);
		assertEquals("Wrong value.", 1, a[2]);
	}

	@Test
	public void testArraySortSortedDescendingPasses() {
		int[] a = { 100, 20, 3 };
		InsertionSort.sort(a, SortingOrder.DESCENDING);
		assertEquals("Wrong value.", 100, a[0]);
		assertEquals("Wrong value.", 20, a[1]);
		assertEquals("Wrong value.", 3, a[2]);
	}

	@Test
	public void testListSortAcendingPasses() {
		List<Integer> a = new ArrayList<>();
		a.add(5);
		a.add(3);
		a.add(1);
		InsertionSort.sort(a, SortingOrder.ASCENDING);
		assertEquals("Wrong value.", 1, a.get(0).intValue());
		assertEquals("Wrong value.", 3, a.get(1).intValue());
		assertEquals("Wrong value.", 5, a.get(2).intValue());
	}

	@Test
	public void testStringListSortDescendingPasses() {
		List<String> a = new ArrayList<>();
		a.add("abc");
		a.add("acc");
		a.add("bc");
		InsertionSort.sort(a, SortingOrder.DESCENDING);
		assertEquals("Wrong value.", "bc", a.get(0));
		assertEquals("Wrong value.", "acc", a.get(1));
		assertEquals("Wrong value.", "abc", a.get(2));
	}

	@Test
	public void testIntegerListSortAcendingPasses() {
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(12);
		a.add(6);
		InsertionSort.sort(a, SortingOrder.ASCENDING);
		assertEquals("Wrong value.", 1, a.get(0).intValue());
		assertEquals("Wrong value.", 6, a.get(1).intValue());
		assertEquals("Wrong value.", 12, a.get(2).intValue());
	}

	@Test
	public void testStringArraySortAscendingPasses() {
		Student[] students = new Student[3];
		students[0] = new Student(1, "John Doe", 3.12);
		students[1] = new Student(12, "Anna Holmer", 3.3);
		students[2] = new Student(6, "Nora McDonald", 3.8);
		InsertionSort.sort(students, SortingOrder.ASCENDING);
		assertEquals("Wrong value.", 1, students[0].getId());
		assertEquals("Wrong value.", "Nora McDonald", students[1].getName());
		assertEquals("Wrong value.", 3.3, students[2].getGpa(), 0.001);
	}
}
