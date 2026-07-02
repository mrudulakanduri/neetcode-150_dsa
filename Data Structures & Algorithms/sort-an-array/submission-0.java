class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
            return nums;
    }
        public void mergeSort(int nums[],int left,int right){
            if(left>=right){
                return;
            }
            int mid = left + (right-left)/2;
            mergeSort(nums,left,mid);
            mergeSort(nums,mid+1,right);
            merged(nums,left,mid,right);
        }
        public void merged(int nums[],int left,int mid,int right){
            int temp[] = new int[right-left+1];
            int i = left;
            int j = mid+1;
            int k = 0;
             while(i<=mid && j <= right){
                if(nums[i] <= nums[j]){
                    temp[k++] = nums[i++];
                }
                else 
                temp[k++] = nums[j++];
             }
             while(i<=mid){
                temp[k++] = nums[i++];
             }
             while(j<=right){
                temp[k++]=nums[j++];
             }

             for(k=0;k<temp.length;k++){
                nums[left+k] = temp[k];
             }
        }
    
}