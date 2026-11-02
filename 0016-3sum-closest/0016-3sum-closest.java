class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int n=arr.length;
        Arrays.sort(arr);
        int closestsum = arr[0] + arr[1] + arr[2];
        
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int currentsum=arr[left]+arr[i]+arr[right];
                if(currentsum==target){
                    return currentsum;
                }
                if(Math.abs(currentsum-target)<Math.abs(closestsum-target)){
                    closestsum=currentsum;
                }
                if(currentsum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return closestsum;
    }
}