class Solution {
    public int removeDuplicates(int[] nums) {
       int k = 1;
       for(int fast=1;fast<nums.length;fast++){
        if(nums[fast] != nums[k-1]){
            nums[k] = nums[fast];
            k++;
        }
       }
       return k;
    }
}