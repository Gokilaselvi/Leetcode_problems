class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        int len=s.length();
        if(len%2==1)return false;
        
        for(char c:s.toCharArray()){
            if(c=='['||c=='{'||c=='('){
                stack.push(c);
                }
            else {
                if(stack.isEmpty()) return false;
                if(stack.peek()=='{' && c=='}')stack.pop();
                else if(stack.peek()=='(' && c==')')stack.pop();
                else if(stack.peek()=='[' && c==']')stack.pop();
                else return false;
            }
        }return stack.isEmpty() ;
        }
}