import java.util.Arrays;
class Productofarray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Productofarray obj = new Productofarray();
        int[] result = obj.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Pass 1: compute prefix products
        result[0] = 1; // no elements before index 0
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Pass 2: multiply with suffix products
        int suffix = 1; // no elements after last index
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i]; // update suffix for next iteration
        }
        return result;
    }
}