class Solution {
    public int[] findErrorNums(int[] arr) {
        int[] ans=new int[2];
        int n=arr.length;
        int i=0;
        while(i<n){
            int idx=arr[i]-1;
            if(arr[i]==arr[idx]) i++;
            else{
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1){
                
                ans[0]=arr[j];
                ans[1]=j+1;
            }
        }
        return ans;


    }
}