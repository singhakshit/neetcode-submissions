class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int left=0;left<s.length();left++){
            char x=s.charAt(left);
            if((x>='a'&&x<='z')||(x>='0'&&x<='9'))
            sb.append(x);
        }
        String s1=sb.toString();
        return sb.reverse().toString().equals(s1);
    }
}
