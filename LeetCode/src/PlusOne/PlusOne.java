import java.util.Arrays;
public class PlusOne {
    //this method for adding the 1 at the last element of array.
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] <= 8) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
    public static void main(String[] args) {
        //creating one array
        int[] array = {9,9,9,9,9};
        //implementing plusOne method.
        int[] result = plusOne(array);
        //printing result array.
        System.out.println(Arrays.toString(result));
    }
}