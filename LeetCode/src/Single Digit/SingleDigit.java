public class SingleDigit {
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for(int num : nums) {
            xor ^= num;
        }
        return xor;
    }

    public static void main(String[] args) {
    	int[] arr = {2,4,3,2,4};

    	int result = singleNumber(arr);
    	System.out.println(result);
    }
}