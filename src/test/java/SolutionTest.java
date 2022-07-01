import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void wordBreakExample1() {
    assertTrue(sol.wordBreak("leetcode", List.of("leet", "code")));
  }
  @Test
  void wordBreakExample2() {
    assertTrue(sol.wordBreak("applepenapple", List.of("apple", "pen")));
  }
  @Test
  void wordBreakExample3() {
    assertFalse(sol.wordBreak("catsandog", List.of("cats","dog","sand","and","cat")));
  }
  @Test
  void wordBreakExample4() {
    assertTrue(sol.wordBreak("abcd", List.of("a","abc","b","cd")));
  }
}