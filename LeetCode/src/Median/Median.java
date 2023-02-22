import java.util.Arrays;
public class Median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+ nums2.length];
        int length = arr.length;
        int index = 0;
        for(int i = 0; i < length; i++) {
            if(i<nums1.length){
                arr[i] = nums1[i];
            }else{
                arr[i] = nums2[index++];
            }
        }
        Arrays.sort(arr);
        return (arr.length%2 == 0) ? (double) ((arr[(arr.length/2)-1] + (double) arr[arr.length/2])/2) : (double)(arr[arr.length/2]);
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2}; int[] nums2 = {5};
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }
}