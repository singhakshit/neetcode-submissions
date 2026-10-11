class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            freq1[x-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char x=t.charAt(i);
            freq2[x-'a']++;
        }
        for(int i=0;i<freq1.length;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}
