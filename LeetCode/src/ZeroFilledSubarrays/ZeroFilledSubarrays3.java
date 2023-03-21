import java.util.Arrays;
public class ZeroFilledSubarrays3 {
    public static long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long subArray = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count++;
                subArray += count;
            } else {
                count = 0;
            }
        }
        return subArray;
    }
    public static void main(String[] args) {
      int[] nums = {2,10,2019, 0, 0}
      System.out.println(zeroFilledSubarray(nums.toString()));
  	}
}