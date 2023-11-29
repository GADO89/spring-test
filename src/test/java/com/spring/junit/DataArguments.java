package com.spring.junit;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class DataArguments implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                Arguments.of("Ahmed" ,21,"1234,"),
                Arguments.of("Karim" ,19,"012245,"),
                Arguments.of("Jo"     ,12,"01223,")
        );
    }
}
