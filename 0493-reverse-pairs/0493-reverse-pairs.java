class Solution {
    
    public int reversePairs(int[] arr) {
        return mergesort(arr);
         
        

    }
    private static void merge(int[]a,int[]b,int[]c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else{
                c[k++]=b[j++];
            }
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
       
    }
    private static int  mergesort(int[]arr){
        int n=arr.length;
        if(n<=1) return 0;
        int[]a=new int[n/2];
        int[]b=new int[n-n/2];
        int idx=0;
        for (int i=0;i<a.length;i++) a[i]=arr[idx++];
        for (int i=0;i<b.length;i++) b[i]=arr[idx++];
        int count=mergesort(a);
        count+=mergesort(b);
        int j=0;
        for(int i=0;i<a.length;i++){
            while(j<b.length && (long)a[i]>2L*b[j]){
                j++;
            }
            count+=j;
        }
        merge(a,b,arr);
        return count;

    }
}