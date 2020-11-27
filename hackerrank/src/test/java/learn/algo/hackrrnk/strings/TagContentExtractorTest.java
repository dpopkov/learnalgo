package learn.algo.hackrrnk.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TagContentExtractorTest {

    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("<h1>Nayeem loves counseling</h1>", List.of("Nayeem loves counseling")),
                Arguments.of("<h1><h1>Sanjay has no watch</h1></h1>", List.of("Sanjay has no watch"))
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void shouldExtractOneWord(String input, List<String> expected) {
        var extractor = new TagContentExtractor();
        var actual = extractor.extract(input);
        assertLinesMatch(expected, actual);
    }
}
