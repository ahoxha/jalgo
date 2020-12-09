package org.hoxha.jalgo.sort.util.inputargs;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class DescendingIntListArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        return Stream.of(
                of(asList(1, 2, 3), asList(3, 2, 1)),
                of(emptyList(), emptyList()),
                of(asList(3, 2, 1), asList(3, 2, 1)),
                of(asList(4, -5, 0), asList(4, 0, -5)),
                of(asList(-4, -8, -4, -2), asList(-2, -4, -4, -8)),
                of(asList(1, 2, 3, 1, 1), asList(3, 2, 1, 1, 1))
        );
    }
}
