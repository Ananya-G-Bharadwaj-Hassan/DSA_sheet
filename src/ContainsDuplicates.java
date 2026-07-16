class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4};

        Solution obj = new Solution();
        boolean result = obj.containsDuplicate(arr);

        System.out.println(result);
    }
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    // found the duplicate
                    return true;
                }
            }
        }
        return false;
    }
}
