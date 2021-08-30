import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.lang.StringBuilder;
import java.util.Random;
public class Tests {
    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!" ,
                    Troll.disemvowel("This website is for losers LOL!"));
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
                Troll.disemvowel
                ("No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals("Wht r y,  cmmnst?" , Troll.disemvowel("What are you, a communist?"));
    }
    public static String generateRandomChars(String candidateChars, int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
        }
        return sb.toString();
    }
    public static String C(String Z) {
        return Z.replaceAll("(?i)[aeiou]" , "");
    }
    @Test
    public void RandomTests() {
        for(int i = 0; i < 100; i++) {
            String X = generateRandomChars(
                "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", i + 3);
            assertEquals(C(X) , Troll.disemvowel(X));
        }
    }
}
