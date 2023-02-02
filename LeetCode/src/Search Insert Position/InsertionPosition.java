import java.util.Arrays;
class InsertionPosition {
    public static int searchInsert(int[] nums, int target) {
        int startPoint = 0;
        int endPoint = nums.length - 1;
        
        while(startPoint <= endPoint){
            
            int mid = (startPoint + endPoint)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                startPoint = mid +1;
            }else{
                endPoint = mid - 1;
            }
        }
    return startPoint;
    }
    public static void main(String[] args) {
        int[] arr = {4,7,2,5};
        int target = 3;

        System.out.println(searchInsert(arr, target));
    }
}