import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class LineTests {
    @Test
    public void test1() {
      assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
    }
   @Test
   public void test2() {
      assertEquals("NO", Line.Tickets(new int []{25, 100}));
    }
     @Test
   public void test3() {
      assertEquals("YES", Line.Tickets(new int[] {25, 25, 25, 25, 25, 25, 25, 25, 25, 25}));
    }
     @Test
   public void test4() {
      assertEquals("NO", Line.Tickets(new int []{50, 50, 50, 50, 50, 50, 50, 50, 50, 50}));
    }
     @Test
   public void test5() {
      assertEquals("NO", Line.Tickets(new int []{100, 100, 100, 100, 100, 100, 100, 100, 100, 100}));
    }
     @Test
   public void test6() {
      assertEquals("YES", Line.Tickets(new int []{25, 25, 25, 25, 50, 100, 50}));
    }
     @Test
   public void test7() {
      assertEquals("NO", Line.Tickets(new int []{50, 100,100}));
    }
     @Test
   public void test8() {
      assertEquals("NO", Line.Tickets(new int []{25, 25, 100}));
    }
     @Test
   public void test9() {
      assertEquals("NO", Line.Tickets(new int []{25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 100, 100, 100, 100}));
    }
     @Test
   public void test10() {
      assertEquals("NO", Line.Tickets(new int []{25,25,50,50,100}));
    }
     @Test
   public void test11() {
      assertEquals("NO", Line.Tickets(new int []{25, 25, 25, 25, 25, 100, 100}));
    }
     @Test
   public void test12() {
      assertEquals("NO", Line.Tickets(new int []{100, 50, 25, 25}));
    }
     @Test
   public void test13() {
      assertEquals("NO", Line.Tickets(new int []{25, 50, 100, 25, 25, 25, 50}));
    }
     @Test
   public void test14() {
      assertEquals("NO", Line.Tickets(new int []{25, 50, 25, 50, 100, 25, 25, 50}));
    }
     @Test
   public void test15() {
      assertEquals("YES", Line.Tickets(new int []{25, 25, 25, 100}));
    }
    @Test
    public void test16() {
      assertEquals("YES", Line.Tickets(new int[] {25, 25, 50, 100}));
    }
}
