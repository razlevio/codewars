import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PrimeTest {

  @Test
  public void testBasic() {
    assertFalse("0  is not prime", Prime.isPrime(0));
    assertFalse("1  is not prime", Prime.isPrime(1));
    assertTrue ("2  is prime",     Prime.isPrime(2));
    assertTrue ("73 is prime",     Prime.isPrime(73));
    assertFalse("75 is not prime", Prime.isPrime(75));
    assertFalse("-1 is not prime", Prime.isPrime(-1));
  }
  
  @Test
  public void testPrime() {
    assertTrue("3 is prime", Prime.isPrime(3));
    assertTrue("5 is prime", Prime.isPrime(5));
    assertTrue("7 is prime", Prime.isPrime(7));
    assertTrue("41 is prime", Prime.isPrime(41));
    assertTrue("5099 is prime", Prime.isPrime(5099));
  }
  
  @Test
  public void testNotPrime() {
    assertFalse("4 is not prime", Prime.isPrime(4));
    assertFalse("6 is not prime", Prime.isPrime(6));
    assertFalse("8 is not prime", Prime.isPrime(8));
    assertFalse("9 is not prime", Prime.isPrime(9));
    assertFalse("45 is not prime", Prime.isPrime(45));
    assertFalse("-5 is not prime", Prime.isPrime(-5));
    assertFalse("-8 is not prime", Prime.isPrime(-8));
    assertFalse("-41 is not prime", Prime.isPrime(-41));
  }
  
  private static final Random rnd = new Random();
  private static final int MAX = 2_000_000_000;
  
  @Test
  public void testRandom() {    
    
    List<TestCaseSpec> testCases = new ArrayList<>();
    
    try {
      
      //prime numbers
      for(int i=0; i<500; ++i) {
        int num = BigInteger.valueOf(rnd.nextInt(MAX)).nextProbablePrime().intValueExact();
        testCases.add(TestCaseSpec.make(num, true));
      }
      
      //composite numers (odd and even)
      for(int i=0; i<450; ++i) {
        int p1 = BigInteger.valueOf(rnd.nextInt(MAX)).nextProbablePrime().intValueExact();
        int p2 = BigInteger.valueOf(p1).nextProbablePrime().intValueExact();
        int num = rnd.nextInt(p2-p1-1) + p1 + 1; 
        testCases.add(TestCaseSpec.make(num, false));
      }
      
      //squares of a prime
      final int ms = (int)Math.sqrt(MAX) - 1000;
      for(int i=0; i<40; ++i) {
        int p1 = BigInteger.valueOf(rnd.nextInt(ms)).nextProbablePrime().intValueExact();
        int num = p1*p1; 
        testCases.add(TestCaseSpec.make(num, false));
      }
      
      //negative numbers
      for(int i=0; i<10; ++i) {
        int p1 = BigInteger.valueOf(rnd.nextInt(ms)).nextProbablePrime().intValueExact();
        int num = -p1; 
        testCases.add(TestCaseSpec.make(num, false));
      }
    
    } catch(ArithmeticException ex) {
      throw new RuntimeException("Error occured when generating a test case. Please retry or raise the kata issue and paste the stack trace.", ex);
    }
    
    Collections.shuffle(testCases);
    for(TestCaseSpec testCase : testCases) {
      
      boolean expected = testCase.isPrime;
      boolean actual = Prime.isPrime(testCase.num);

      if(expected) {
        assertTrue(testCase.num + " is prime", actual);
      } else {
        assertFalse(testCase.num + " is not prime", actual);
      }
    }
  }
  
  private static class TestCaseSpec {
    int num;
    boolean isPrime;
    
    public static TestCaseSpec make(int num, boolean isPrime) {
      TestCaseSpec testCase = new TestCaseSpec();
      testCase.isPrime = isPrime;
      testCase.num = num;
      return testCase;
    }
  }
}
