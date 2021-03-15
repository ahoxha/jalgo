package org.hoxha.jalgo.sort.util.inputargs;

import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;

import org.assertj.core.util.Arrays;
import org.hoxha.jalgo.sort.model.Student;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class AscendingObjectArrayArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of( //
                of(getStudentsUnsorted(), getStudentsSorted()), //
                of(getStudentsSorted(), getStudentsSorted()) //
        );
    }

    private Student[] getStudentsUnsorted() {
        return Arrays.array( //
                Student.of(4, "Trevor", 3.78), //
                Student.of(2,"Laura", 4.0), //
                Student.of(1,"John", 3.45), //
                Student.of(3,"Emma", 3.12) //
        );
    }

    private Student[] getStudentsSorted() {
        return Arrays.array( //
                Student.of(1,"John", 3.45), //
                Student.of(2,"Laura", 4.0), //
                Student.of(3,"Emma", 3.12), //
                Student.of(4, "Trevor", 3.78) //
        );
    }
}
