package learn.algo.hackrrnk.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HackerRankTweets {
    private final Pattern pattern = Pattern.compile("hackerrank", Pattern.CASE_INSENSITIVE);

    public boolean test(String tweet) {
        return pattern.matcher(tweet).find();
    }

    public static void main(String[] args) {
        HackerRankTweets tweetMatcher = new HackerRankTweets();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String tweet = in.nextLine();
            if (tweetMatcher.test(tweet)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
