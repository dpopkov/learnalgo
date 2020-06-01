package learn.algo.hackrrnk.regex;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class ValidPanFormatTest  {

    @Test
    public void testIsValid() {
        String[] input = {
                "ABCDS1234Y",
                "ABAB12345Y",
                "avCDS1234Y",
        };
        boolean[] expected = {true, false, false};
        ValidPanFormat vpf = new ValidPanFormat();
        boolean[] results = new boolean[input.length];
        for (int i = 0; i < input.length; i++) {
            results[i] = vpf.isValid(input[i]);
        }
        assertThat(results, is(expected));
    }
}
