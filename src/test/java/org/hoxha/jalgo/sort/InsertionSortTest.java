package org.hoxha.jalgo.sort;

import static java.util.Arrays.asList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.hoxha.jalgo.sort.model.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

    private final Sort sut = SortFactory.insertionSort();

    @DisplayName("Testing sorting of integer arrays.")
    @Nested
    class IntArrayTest {
        @Test
        void testArraySortAscending() {
            int[] array = { 5, 3, 1 };

            sut.sortAscending(array);

            assertArrayEquals(new int[] { 1, 3, 5 }, array);
        }

        @Test
        void testArrayWithOneElementSortAscending() {
            int[] array = { 1 };

            sut.sortAscending(array);

            assertThat(array[0]).isOne();
        }

        @Test
        void testEmptyArraySortAscending() {
            try {
                int[] array = new int[0];
                sut.sortAscending(array);
            } catch (ArrayIndexOutOfBoundsException ex) {
                fail("It should not have thrown an exception.");
            }
        }

        @Test
        void testArraySortDescending() {
            int[] array = { 1, 8, 2 };

            sut.sortDescending(array);

            assertArrayEquals(new int[] { 8, 2, 1 }, array);
        }

        @Test
        void testSortedArraySortDescending() {
            int[] array = { 100, 20, 3 };

            sut.sortDescending(array);

            assertArrayEquals(new int[] { 100, 20, 3 }, array);
        }
    }

    @DisplayName("Test sorting of lists")
    @Nested
    class ListTest {
        @Test
        void testListSortAscending() {
            List<Integer> list = asList(5, 3, 1);

            sut.sortAscending(list);

            assertThat(list).isEqualTo(asList(1, 3, 5));
        }

        @Test
        void testListSortDescending() {
            List<Integer> list = asList(1, 3, 5);

            sut.sortDescending(list);

            assertThat(list).isEqualTo(asList(5, 3, 1));
        }

        @Test
        void testStringListSortAscending() {
            List<String> list = asList("bc", "abc", "acc");

            sut.sortAscending(list);

            assertThat(list).isEqualTo(asList("abc", "acc", "bc"));
        }

        @Test
        void testStringListSortDescending() {
            List<String> list = asList("abc", "acc", "bc");

            sut.sortDescending(list);

            assertThat(list).isEqualTo(asList("bc", "acc", "abc"));
        }

        @Test
        void testIntegerListSortAscending() {
            List<Integer> list = asList(1, 12, 6);

            sut.sortAscending(list);

            assertThat(list).isEqualTo(asList(1, 6, 12));
        }

        @Test
        void testIntegerListSortDescending() {
            List<Integer> list = asList(1, 12, 6);

            sut.sortDescending(list);

            assertThat(list).isEqualTo(asList(12, 6, 1));
        }
    }

    @DisplayName("Test soring of arrays of objects.")
    @Nested
    class ObjectArrayTest {
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
}
