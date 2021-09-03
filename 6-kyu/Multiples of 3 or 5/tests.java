import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
      assertEquals(23, new Solution().solution(10));
      assertEquals(78, new Solution().solution(20));
      assertEquals(9168, new Solution().solution(200));
    }
}
