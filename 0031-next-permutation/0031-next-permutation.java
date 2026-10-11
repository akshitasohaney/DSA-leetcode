class Solution {
    public void nextPermutation(int[] nums) {
        int n= nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i])
            j--;
            swap(nums,j,i);
        }
        
        int left=i+1;
        int right=n-1;
        while(left<=right){
            swap(nums, left, right);
            left++;
            right--;
        }
        
    }
    private void swap(int[]nums, int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}