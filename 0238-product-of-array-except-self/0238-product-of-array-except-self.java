class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int [] ans= new int[n];
        int prefix=1;
        int suffix=1;
        for(int i=0;i<n;i++){
            ans[i]= prefix;
            prefix=prefix*arr[i];
        }
        for(int i=n-1; i>=0;i--){
            ans[i]=ans[i]*suffix;
            suffix=suffix*arr[i];
        }
        return ans;
    }
}