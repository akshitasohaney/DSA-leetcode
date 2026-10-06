class Solution {
    public int compress(char[] chars) {
        StringBuilder sb =new StringBuilder();
        int i=0;
        while(i<chars.length){
            int j=i;
            while(j<chars.length && chars[i]==chars[j]){
                j++;
            }
            sb.append(chars[i]);
            int num=j-i;
            if(num>1)
            sb.append(num);
            i=j;
        }
        for(i=0; i<sb.length(); i++){
            chars[i]=sb.charAt(i);
        }
        return sb.length();
    }
}