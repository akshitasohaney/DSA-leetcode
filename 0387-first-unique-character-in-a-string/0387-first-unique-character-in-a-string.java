class Solution {
    public int firstUniqChar(String s) {
       int[] freq = new int[26]; //freq array
       for(int i=0; i<s.length() ; i++){ //count freq
        freq[s.charAt(i)-'a']++;
       
       }
       for(int i=0;i<s.length();i++){ //find 
        if(freq[s.charAt(i)-'a'] ==1) return i;

       }
       return -1;

    }
}