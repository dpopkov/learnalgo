package learn.algo.hackrrnk.regex;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class SplitThePhoneNumbersTest {

    @Test
    public void whenDividedBySpaceThenSplitsToGroups() {
        String input = "1 877 2638277";
        String[] expected = {"1", "877", "2638277"};
        String[] result = new SplitThePhoneNumbers().splitToGroups(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenDividedByHyphenThenSplitsToGroups() {
        String input = "91-011-23413627";
        String[] expected = {"91", "011", "23413627"};
        String[] result = new SplitThePhoneNumbers().splitToGroups(input);
        assertThat(result, is(expected));
    }
}
