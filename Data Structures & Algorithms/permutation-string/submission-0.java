class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){
            return false;
        }
        int[] freqs1=new int[26];
        int[] freqs2=new int[26];
        for(int i=0;i<s1.length();i++){
            char x=s1.charAt(i);
            freqs1[x-'a']++;
        }
        int i=0,j=0;
        while(j<s2.length()){
            char x=s2.charAt(j);
            freqs2[x-'a']++;
            if((j-i+1)<s1.length()){
                j++;
                continue;
            }
            else{
                boolean flag=true;
                for(int idx=0;idx<26;idx++){
                    if(freqs1[idx]!=freqs2[idx]){
                        flag=false;
                        break;
                    }
                }
                if(flag)
                return true;
            }
            freqs2[s2.charAt(i++)-'a']--;
            j++;
        }
        return false;
    }
}
