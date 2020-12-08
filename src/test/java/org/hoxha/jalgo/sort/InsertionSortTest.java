package org.hoxha.jalgo.sort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hoxha.jalgo.sort.model.Student;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

    private Sort sut = new InsertionSort();

    @Test
    void testArraySortAscendingPasses() {
        int[] a = { 5, 3, 1 };

        sut.sortAscending(a);

        assertArrayEquals(new int[] { 1, 3, 5 }, a);
    }

    @Test
    void testArrayWithOneElementSortAcendingPasses() {
        int[] a = { 1 };

        sut.sortAscending(a);

        assertThat(a[0]).isOne();
    }

    @Test
    void testEmptyArraySortAscendingPasses() {
        try {
            int[] a = new int[0];
            sut.sortAscending(a);
        } catch (ArrayIndexOutOfBoundsException ex) {
            fail("It should not have thrown an exception.");
        }
    }

    @Test
    void testArraySortDescendingPasses() {
        int[] a = { 1, 8, 2 };

        sut.sortDescending(a);

        assertArrayEquals(new int[] { 8, 2, 1 }, a);
    }

    @Test
    void testArraySortSortedDescendingPasses() {
        int[] a = { 100, 20, 3 };

        sut.sortDescending(a);

        assertArrayEquals(new int[] { 100, 20, 3 }, a);
    }

    @Test
    void testListSortAscendingPasses() {
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(3);
        a.add(1);

        sut.sortAscending(a);

        assertThat(a).isEqualTo(Arrays.asList(1, 3, 5));
    }

    @Test
    void testStringListSortDescendingPasses() {
        List<String> a = new ArrayList<>();
        a.add("abc");
        a.add("acc");
        a.add("bc");

        sut.sortDescending(a);

        assertThat(a).isEqualTo(Arrays.asList("bc", "acc", "abc"));
    }

    @Test
    void testIntegerListSortAscendingPasses() {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(12);
        a.add(6);

        sut.sortAscending(a);

        assertThat(a).isEqualTo(Arrays.asList(1, 6, 12));
    }

    @Test
    void testStringArraySortAscendingPasses() {
        Student[] students = getStudentsArray();

        sut.sortAscending(students);

        assertThat(students[0].getId()).isOne();
        assertThat(students[1].getName()).isEqualTo("Nora McDonald");
        assertThat(students[2].getGpa()).isEqualTo(3.3);
    }

    @Test
    void testStringArraySortDescending() {
        Student[] students = getStudentsArray();

        sut.sortDescending(students);

        assertThat(students[0].getGpa()).isEqualTo(3.3);
        assertThat(students[1].getName()).isEqualTo("Nora McDonald");
        assertThat(students[2].getId()).isOne();
    }

    private Student[] getStudentsArray() {
        Student[] students = new Student[3];
        students[0] = new Student(1, "John Doe", 3.12);
        students[1] = new Student(12, "Anna Holmer", 3.3);
        students[2] = new Student(6, "Nora McDonald", 3.8);
        return students;
    }
}
