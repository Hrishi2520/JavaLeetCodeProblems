class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i = 0; i < nums[nums.length-1]; i++) {
            if(nums[i] != i) return i;
        }
        return i+1;
    }
}