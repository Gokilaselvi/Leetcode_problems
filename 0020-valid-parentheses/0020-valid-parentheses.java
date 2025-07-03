class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        int len=s.length();
        if(len==1)return false;
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='[')st.push(c);
            else{
               if( st.isEmpty())return false;
               char top=st.peek();
               if(top=='('&&c==')')st.pop();
               else if(top=='{'&&c=='}')st.pop();
               else if(top=='['&&c==']')st.pop();
               else return false;
            }
        }
        return st.isEmpty();
        }
}