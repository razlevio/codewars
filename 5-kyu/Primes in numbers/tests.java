import static org.junit.Assert.*;
import org.junit.Test;

public class prDecompTest {
    
    private static void testing(int n, String exp) {
        System.out.println("Testing " + n);
        String ans = PrimeDecomp.factors(n);
        System.out.println("Actual " + ans);
        System.out.println("Expect " + exp);
        assertEquals(exp, ans);
        System.out.println("#");
    }
    
    @Test
    public void test() {
        testing(7775460, "(2**2)(3**3)(5)(7)(11**2)(17)");
        testing(7919, "(7919)");
        testing(17*17*93*677, "(3)(17**2)(31)(677)");
        testing(933555431, "(7537)(123863)");
        testing(342217392, "(2**4)(3)(11)(43)(15073)");
        testing(35791357, "(7)(5113051)");
        testing(782611830, "(2)(3**2)(5)(7**2)(11)(13)(17)(73)");
        testing(775878912, "(2**8)(3**4)(17)(31)(71)");
        testing(483499306, "(2)(41**2)(143813)");
    }
    
    private static int randInt(int min, int max) {
        return (int)(min + Math.random() * ((max - min) + 1));
    }
    
    public static String factors232(int lst) {
        String result = "";
        for (int fac = 2; fac <= lst; ++fac) {
            int count;
            for (count = 0; lst % fac == 0; ++count) {
                lst /= fac;
            }
            if (count > 0) {
                result += "(" + fac + (count > 1 ? "**" + count : "") + ")";
            }
        }
        return result;
    }
    @Test
    public void test1() {
        System.out.println("Random Tests");
        for (int i = 0; i < 50; i++) {
            int n = randInt(100000, 77587891);           
            String exp = factors232(n);
            testing(n, exp);
        }
    }
}
