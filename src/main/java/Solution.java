import java.util.List;

public class Solution {
  public boolean wordBreak(String s, List<String> wordDict) {
     int sLen = s.length();
     boolean[] dp = new boolean[sLen+1];
     dp[sLen] = true;
     for (int start = sLen - 1; start >=0; start--) {
        for (String word : wordDict) {
          if (start + word.length() <= sLen &&
              s.substring(start, start+word.length()).equals(word)) {
            dp[start]= dp[start+word.length()];
          }
          if (dp[start]) {
            break;
          }
        }
     }
     return dp[0];
  }
}
