class MissingNumber {
    public int missingNumber(int[] nums) {
        int res=nums.length;
        for(int i=0;i<nums.length;i++){
            res^=i;
            res^=nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,3,4,5,6,7,8,9};
        MissingNumber obj = new MissingNumber();
        int result = obj.missingNumber(nums);
        System.out.println(result);
    }
}