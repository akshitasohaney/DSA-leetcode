class Solution {
        public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length, mid;
        while (low < high) {
            mid = (low+high) / 2;
            if(arr[mid]- 1- mid < k)
                low = mid + 1;
            else
                high = mid;
        }
        return low + k;
    }
   
   
}