public class MaxSubArray {
  public static int sequence(int[] arr) {
        int max = 0;
        int sum = 0;
        for(int val : arr) {
            sum += val;
            max = Math.max(sum, max);
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
  }
}
