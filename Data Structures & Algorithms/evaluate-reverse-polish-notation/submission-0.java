class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int a=st.pop();
                int b=st.pop();
                int ans=0;
                switch(tokens[i]){
                    case "+":ans=b+a;
                    break;
                    case "-":ans=b-a;
                    break;
                    case "*":ans=b*a;
                    break;
                    case "/":ans=b/a;
                    break;
                }
                st.push(ans);
            }
            else{
                int x=Integer.parseInt(tokens[i]);
                st.push(x);
            }
        }
        return st.pop(); 
    }
}
