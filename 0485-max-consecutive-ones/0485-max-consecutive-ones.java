class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n=arr.length;
        int count=0;
        int maxcount=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                maxcount=Math.max(maxcount,count);
                count=0;
            }
        }
        if(maxcount>count)
        return maxcount;
        else return count;
   
    }
}