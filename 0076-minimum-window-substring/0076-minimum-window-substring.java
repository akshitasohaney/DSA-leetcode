class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int[] freq= new int[128];
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        int left=0;
        int start=0;
        int required=t.length();
        int minlen=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(freq[c]>0)
            required--;
            freq[c]--;
            while(required==0){
                int len=right-left+1;
                if(len<minlen){
                    minlen=len;
                    start=left;
                }
                char leftchar=s.charAt(left);
                freq[leftchar]++;
                if(freq[leftchar]>0){
                    required++;

                }
                left++;

            }

        }
      if (minlen == Integer.MAX_VALUE) {
    return "";
} else {
    return s.substring(start, start + minlen);
}
    
    }
}