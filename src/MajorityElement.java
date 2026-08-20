class Majority{
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,3,3,4,5};
        Majority obj=new Majority();
        int result=obj.majorityElement(nums);
        System.out.println(result);
    }
}
