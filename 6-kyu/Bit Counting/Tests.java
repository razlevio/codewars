import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Random;

public class BitCountingTest {
  @Test
  public void testGame() {
    assertEquals(0, BitCounting.countBits(0)); 
    assertEquals(5, BitCounting.countBits(1234)); 
    assertEquals(1, BitCounting.countBits(4)); 
    assertEquals(3, BitCounting.countBits(7));
    assertEquals(3, BitCounting.countBits(26));
    assertEquals(2, BitCounting.countBits(9)); 
    assertEquals(2, BitCounting.countBits(10)); 
    
    assertEquals(14, BitCounting.countBits(77231418)); 
    assertEquals(11, BitCounting.countBits(12525589)); 
    assertEquals(8, BitCounting.countBits(3811));
    assertEquals(17, BitCounting.countBits(392902058)); 
    assertEquals(3, BitCounting.countBits(1044)); 
    assertEquals(10, BitCounting.countBits(10030245)); 
    assertEquals(16, BitCounting.countBits(183337941)); 
    assertEquals(14, BitCounting.countBits(20478766));
    assertEquals(9, BitCounting.countBits(103021)); 
    assertEquals(6, BitCounting.countBits(287)); 
    assertEquals(15, BitCounting.countBits(115370965)); 
    assertEquals(5, BitCounting.countBits(31)); 
    assertEquals(7, BitCounting.countBits(417862)); 
    assertEquals(12, BitCounting.countBits(626031)); 
    assertEquals(4, BitCounting.countBits(89)); 
    assertEquals(10, BitCounting.countBits(674259)); 
  }
  
  @Test
  public void randomTests(){
    Random r = new Random();
    for(int i = 0; i < 100; i++){
      int n = r.nextInt((int)Math.pow(10, r.nextInt(10)));
      int exp = Integer.toBinaryString(n).replace("0", "").length();
      assertEquals(exp, BitCounting.countBits(n)); 
    }
  }
}
