class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return nums.length;
        
        int j = -1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val)
                nums[++j] = nums[i];
        }

        return ++j;
    }

    public static void main(string[] args) {
    	int[] arr= {1,2,3,2,1,2,2};
    	System.out.println(removeElement(arr, 2));
    }
}