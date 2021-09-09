import java.util.LinkedHashMap;

/*
 * Given a positive number n > 1 find the prime factor decomposition of n.
 * The result will be a string with the following form :
 * "(p1**n1)(p2**n2)...(pk**nk)"
 * with the p(i) in increasing order and n(i) empty if n(i) is 1.
 * 
 * Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
 */
public class solution {
    public static String factors(int n) {
        var solution = new LinkedHashMap<Integer, Integer>();
        String result = "";
        int count = 0;
        int primeIndicator = -1;

        // If the number is prime, return the number itself
        if (isPrime(n)) {
            return "(" + n + ")";
        }

        // Traversing numbers from 2 to n checking if i is prime, and make the proper calculations
        for (int i = 2; i <= n; i++) {
            if (isPrime(n)) {
                solution.put(primeIndicator, n);
                break;
            }

            if (!isPrime(i)) {
                continue;

            } else {
                while (n % i == 0) {
                    n = n / i;
                    count++;
                }

                if (count >= 1) {
                    solution.put(i, count);
                }
                count = 0;
            }

            if (n <= 1) {
                break;
            }
        }

        var keys = solution.keySet();
        for (int i : keys) {
            // If the value of this key is PRIME so present value only
            if (i == -1) {
                result += "(" + solution.get(i) + ")";
                continue;
            }
            // If the number of times the prime divisor is equal 1 present only the key
            // (which is the prime divisor)
            if (solution.get(i) == 1) {
                result += "(" + i + ")";

            } else { // Else present divisor and number of times
                result += "(" + i + "**" + solution.get(i) + ")";
            }
        }
        return result;
    }

    public static boolean isPrime(int num) {
        // Check if num is prime number or not
        if ((num > 2 && num % 2 == 0) || num == 1 || num == 0) {
            return false;
        }
        for (int i = 3; i <= (int) Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
