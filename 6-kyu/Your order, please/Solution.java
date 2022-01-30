import java.util.TreeMap;
public class Solution {
  public static String order(String words) {
        String[] wordsArray = words.split(" ");
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        String result = "";

        for(int i = 0; i < wordsArray.length; i++) {
            for(int j = 0; j < wordsArray[i].length(); j++) {
                if(Character.isDigit(wordsArray[i].charAt(j))) {
                    map.put(Character.getNumericValue(wordsArray[i].charAt(j)), wordsArray[i]);
                }
            }
        }
        var entrySet = map.entrySet();
        var iter = entrySet.iterator();

        while(iter.hasNext()) {
            var next = iter.next();
            if(iter.hasNext()) {
                result = result + next.getValue() + " ";
            } else {
                result = result + next.getValue();
            }
        }
        return result;
  }
}
