package org.hoxha.jalgo.sort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;

import org.hoxha.jalgo.sort.model.Student;
import org.hoxha.jalgo.sort.util.inputargs.AscendingIntArrayArgumentsProvider;
import org.hoxha.jalgo.sort.util.inputargs.AscendingIntListArgumentsProvider;
import org.hoxha.jalgo.sort.util.inputargs.AscendingObjectArrayArgumentsProvider;
import org.hoxha.jalgo.sort.util.inputargs.DescendingIntArrayArgumentsProvider;
import org.hoxha.jalgo.sort.util.inputargs.DescendingIntListArgumentsProvider;
import org.hoxha.jalgo.sort.util.inputargs.DescendingObjectArrayArgumentsProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

public abstract class AbstractSortTest {

    private static final String DISPLAY_NAME = "{0} must be sorted into {1}";
    private Sort sut;

    public abstract Sort getInstance();

    @BeforeEach
    void setUp() {
        sut = getInstance();
    }

    @DisplayName("Testing sorting of integer arrays.")
    @Nested
    class IntArrayTest {
        @ParameterizedTest(name = DISPLAY_NAME)
        @ArgumentsSource(AscendingIntArrayArgumentsProvider.class)
        void testSortAscending(int[] input, int[] expectedOutput) {
            sut.sortAscending(input);

            assertThat(input).isEqualTo(expectedOutput);
        }

        @ParameterizedTest(name = DISPLAY_NAME)
        @ArgumentsSource(DescendingIntArrayArgumentsProvider.class)
        void testSortDescending(int[] input, int[] expectedOutput) {
            sut.sortDescending(input);

            assertThat(input).isEqualTo(expectedOutput);
        }
    }

    @DisplayName("Test sorting of lists")
    @Nested
    class ListTest {
        @ParameterizedTest(name = DISPLAY_NAME)
        @ArgumentsSource(AscendingIntListArgumentsProvider.class)
        void testSortAscending(List<Integer> input, List<Integer> expectedOutput) {
            sut.sortAscending(input);

            assertThat(input).isEqualTo(expectedOutput);
        }

        @ParameterizedTest(name = DISPLAY_NAME)
        @ArgumentsSource(DescendingIntListArgumentsProvider.class)
        void testSortDescending(List<Integer> input, List<Integer> expectedOutput) {
            sut.sortDescending(input);

            assertThat(input).isEqualTo(expectedOutput);
        }
    }

    @DisplayName("Test sorting of arrays of Comparable objects")
    @Nested
    class ComparableObjectTest {
        @ParameterizedTest(name = DISPLAY_NAME)
        @ArgumentsSource(AscendingObjectArrayArgumentsProvider.class)
        void testSortAscending(Student[] input, Student[] expectedOutput) {
            sut.sortAscending(input);

            assertThat(input).isEqualTo(expectedOutput);
        }

        @ParameterizedTest(name = DISPLAY_NAME)
        @ArgumentsSource(DescendingObjectArrayArgumentsProvider.class)
        void testSortDescending(String[] input, String[] expectedOutput) {
            sut.sortDescending(input);

            assertThat(input).isEqualTo(expectedOutput);
        }
    }
}
