import java.util.Arrays;
public class ZeroFilledSubarrays2 {
    public static long zeroFilledSubarray(int[] nums) {
        long contCount = 0;
        long subarrays = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                contCount++;
            }
            else{
                subarrays += (contCount*(contCount+1)/2);
                contCount=0;
            }
        }
        // if the last element was 0, we need to calculate for it
        if(contCount>0){
            subarrays += (contCount*(contCount+1)/2);
        }
        return subarrays;
    }
    public static void main(String[] args) {
      int[] nums = {0,0,0,2,0,0}
      System.out.println(zeroFilledSubarray(nums.toString()));
  	}
}