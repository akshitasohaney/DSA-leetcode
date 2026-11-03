class Solution {
    public long maximumSumOfHeights(int[] height) {
        int n=height.length;
        long ans=0;
        for(int i=0;i<n;i++){
            long sum=height[i];
            int prev=height[i];
            for(int j=i-1;j>=0;j--){
                prev=Math.min(prev,height[j]);
                sum+=prev;
            }
            prev=height[i];
            for(int j=i+1;j<n;j++){
                prev=Math.min(prev,height[j]);
                sum+=prev;
            }
            ans=Math.max(ans,sum);


        }
        return ans;
    }
}