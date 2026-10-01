class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int left=0,right=0,ans=0;
        while(right<s.length()){
            char x=s.charAt(right);
            if(map.containsKey(x)){
                ans=Math.max(ans,right-left);
                map.remove(s.charAt(left++));
            }
            else{
                map.put(x,1);
                right++;
            }
        }
        ans=Math.max(ans,right-left);
        return ans;
    }
}
