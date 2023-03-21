import java.util.Arrays;
public class ZeroFilledSubarrays {
    public static long zeroFilledSubarray(int[] nums) {
        long result = 0;
        for(int i = 0, j = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                j = i + 1;
            }
            result += i - j + 1; 
        }
        return result;
    }
    public static void main(String[] args) {
      int[] nums = {1,3,0,0,2,0,0,4}
      System.out.println(zeroFilledSubarray(nums.toString()));
  	}
}