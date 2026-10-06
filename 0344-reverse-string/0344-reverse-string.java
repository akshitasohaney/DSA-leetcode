class Solution {
    public void reverseString(char[] s) {
        int i=0, n=s.length, j=n-1;
        char temp;
        while(i<=j){
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}