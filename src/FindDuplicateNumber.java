class FindDuplicates {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
        public static void main(String[] args) {
            int[] nums = {1, 3, 4, 2, 2};
            FindDuplicates obj = new FindDuplicates();
            int result = obj.findDuplicate(nums);
            System.out.println(result);
        }
    }
