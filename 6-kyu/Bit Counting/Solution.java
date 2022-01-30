import java.util.HashMap;
public class Solution {

  public static int countBits(int n) {
    // -------- Much Simpler built in solution --------------------
    int sol = Integer.bitCount(n);
    // ------------------------------------------------------------
    int num = n;
    int result = 0;
    int bitValue = 1;
    int numberOfBits = (int)Math.floor(((Math.log(n) / Math.log(2)) + 1));
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    int totalBits = 0;
    
    for(int i = 1; i <= numberOfBits; i++) {
      if(i == 1) {
        map.put(i, bitValue);
      } else {
        bitValue = bitValue * 2;
        map.put(i, bitValue);
      }
    }
    
    int i = numberOfBits;
    while(num > 0) {
      if(num >= map.get(i)) {
        num = num - map.get(i);
        result++;
        i--;
      } else {
        i--;
      }
    }
    return result;
  }
}
