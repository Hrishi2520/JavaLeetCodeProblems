class RemoveDuplecates {
    public static int removeDuplicates(int[] nums) {
        int p = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[p] != nums[i]) {
                nums[p+1] = nums[i];
                p++;
            }
        }
        return p + 1;
    }

    public static void main(String[] args) {
        int[] array = {2,4,3,1,4,3,2};
        int duplicates = removeDuplicates(array);
        System.out.println(duplicates);
    } 
}