package org.hoxha.jalgo.sort.util.inputargs;

import static org.assertj.core.util.Arrays.array;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class DescendingObjectArrayArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of( //
                of(array("abc", "acb", "cba"), array("cba", "acb", "abc")), //
                of(array("xyz", "axy", "aby"), array("xyz", "axy", "aby")), //
                of(array("a", "r", "e", "d"), array("r", "e", "d", "a")), //
                of(array("a", "c", "x", "a"), array("x", "c", "a", "a")) //
        );
    }
}
