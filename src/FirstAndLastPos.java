import java.util.*;
class Solution {
    //search range
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        int left=binarySearch(nums,target,true);
        int right=binarySearch(nums,target,false);
        res[0]=left;
        res[1]=right;
        return res;
    }

    //main function
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        Solution obj = new Solution();
        int[] result = obj.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }

    //binary search
    private int binarySearch(int[] nums, int target, boolean search){
        int left=0;
        int right=nums.length-1;
        int idx=-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                idx=mid;
                if(search){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
        }
        return idx;
    }
}