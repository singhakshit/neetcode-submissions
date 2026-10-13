class Solution {
    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }
        Stack<Character> st=new Stack<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('||ch[i]=='{'||ch[i]=='['){
                st.push(ch[i]);
            }
            else{
                if(!st.isEmpty()){
                    char x=st.pop();
                    switch(ch[i]){
                    case ')': if(x!='(')
                    return false;
                    break;
                    case '}': if(x!='{')
                    return false;
                    break;
                    case ']': if(x!='[')
                    return false;
                    break;
                }}
                else
                return false;
            }
         }
            return st.isEmpty();
        }
    }

