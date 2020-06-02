package learn.algo.hackrrnk.regex;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

@SuppressWarnings("SpellCheckingInspection")
public class HackerRankTweetsTest {

    @Test
    public void whenContainsHackerRankThenTrue() {
        HackerRankTweets hrt = new HackerRankTweets();
        String[] inputs = {
                "I love #hackerrank",
                "I just scored 27 points in the Picking Cards challenge on #HackerRank",
                "I just signed up for summer cup @hackerrank",
                "interesting talk by hari, co-founder of hackerrank"
        };
        boolean[] expected = {true, true, true, true};
        boolean[] results = new boolean[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            results[i] = hrt.test(inputs[i]);
        }
        assertThat(results, is(expected));
    }

    @Test
    public void whenNotContainsHackerRankThenFalse() {
        HackerRankTweets hrt = new HackerRankTweets();
        String[] inputs = {
                "I love #hacker rank",
                "I just scored 27 points in the Picking Cards challenge on #Hack3rRank",
                "I just signed up for summer cup @hacker-rank",
                "interesting talk by hari, co-founder of hacker_rank"
        };
        boolean[] expected = {false, false, false, false};
        boolean[] results = new boolean[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            results[i] = hrt.test(inputs[i]);
        }
        assertThat(results, is(expected));
    }
}
