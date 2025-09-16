class Solution {
    public int evalRPN(String[] tokens) {
        int ans=0;
        char c;
        int val;
        int val1=1;
        int val2=1;
        Stack<Integer>stack=new Stack<>();
        for(String str:tokens){
            
          c=str.charAt(0);
                      //System.out.print(c+" ");


          if((c=='+'||c=='-'||c=='*'||c=='/') && str.length()==1){
           
           if(!stack.isEmpty()) {
            val2=stack.peek();
            stack.pop();
           }
            if(!stack.isEmpty()){
            val1=stack.peek();
            stack.pop();
            }
            if(c=='+')ans=val1+val2;
            else if(c=='-')ans=val1-val2;
            else if(c=='*')ans=val1*val2;
            else ans=val1/val2;

            stack.push(ans);
          }
          else{
            val=Integer.parseInt(str);
            stack.push(val);
          }

        }return stack.peek();
    }
}