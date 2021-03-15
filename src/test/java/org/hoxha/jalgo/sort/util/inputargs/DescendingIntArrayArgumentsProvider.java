package org.hoxha.jalgo.sort.util.inputargs;

import static org.hoxha.jalgo.sort.util.TestUtils.asArray;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class DescendingIntArrayArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of( //
                of(asArray(1, 2, 3, 4), asArray(4, 3, 2, 1)), //
                of(asArray(4, 3, 2, 1), asArray(4, 3, 2, 1)), //
                of(asArray(1, 4, 2, 3), asArray(4, 3, 2, 1)), //
                of(asArray(), asArray()), //
                of(asArray(1), asArray(1)), //
                of(asArray(0, 0, 0), asArray(0, 0, 0)), //
                of(asArray(3, -4, 5, 5), asArray(5, 5, 3, -4)), //
                of(asArray(-1, -3, -10), asArray(-1, -3, -10)) //
        );
    }
}
