class Solution {
    public int evalRPN(String[] tokens) {
       
       Stack< Integer>st=new Stack<>();
       int peek,peek2,push;

       for(String i:tokens){
        switch(i){
        case "+":
         peek=st.peek();
         st.pop();
         peek2=st.peek();
         st.pop();
         push=peek2+peek;
         st.push(push);
         break;
       case "-":
         peek=st.peek();
         st.pop();
         peek2=st.peek();
         st.pop();
         push=peek2-peek;
         st.push(push);
         break;
       case "*":
         peek=st.peek();
         st.pop();
         peek2=st.peek();
         st.pop();
         push=peek2*peek;
         st.push(push);
         break;
       case "/":
         peek=st.peek();
         st.pop();
         peek2=st.peek();
         st.pop();
         push=(int)peek2/peek;
         st.push(push);
         break;
         default:
         st.push(Integer.parseInt(i));
       }
       }
         return st.peek();

    }
}