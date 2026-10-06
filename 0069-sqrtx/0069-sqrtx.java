class Solution {
    public int mySqrt(int n) {
        if(n==0||n==1)
        return n;
        int low=1;
        int high=n;
        while(low<=high){
            int mid= low+(high-low)/2;
            if((long)mid*mid>(long)n)
            high=mid-1;
            else if(mid*mid==n)
            return mid;
            else low=mid+1;

        }
        return Math.round(high);

    }
}