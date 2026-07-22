class Solution {
    public int characterReplacement(String s, int k) {
        int right, left=0,maxFreq=0,res=0;
        int count[] = new int[26];
        for(right=0;right<s.length();right++){
            char ch = s.charAt(right);
            count[ch - 'A']++;
            maxFreq = Math.max(maxFreq,count[ch-'A']);
        

        while((right-left+1)-maxFreq > k){
            count[s.charAt(left)-'A']--;
            left++;
        }
       
        res = Math.max(res,(right-left+1));
 }
        return res;
    }
}
