public class Solution {
  public static int findIt(int[] a) {
    int numOfInstances = 0;
    int odd = -1;
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a.length; j++) {
        if(a[i] == a[j])
          numOfInstances++;
      }
      if(numOfInstances % 2 != 0) {
        odd = a[i];
        return odd;
      } else {
        numOfInstances = 0;
      }
    }
    return odd;
  }
}
