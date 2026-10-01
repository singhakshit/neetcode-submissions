class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int left=0,right=0,ans=0,maxfreq=0,ork=k;
        while(right<s.length()){
            char x=s.charAt(right);
            freq[x-'A']++;
            maxfreq=Math.max(maxfreq,freq[x-'A']);
            while((right-left+1)-maxfreq>k){
                char y=s.charAt(left++);
                freq[y-'A']--;
            }
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}
