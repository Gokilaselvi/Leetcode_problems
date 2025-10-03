class Solution {
    public int dayOfYear(String date) {
       int year=Integer.parseInt(date.substring(0,4) );
       boolean leap;
       int day=0;
       
       int month=Integer.parseInt(date.substring(5,7));
       if((year%400 ==0 || year %4 ==0 && year%100!=0)  && month>2){
     day++;
       }

       for(int i=1;i<month;i++){
        if(i==2)day+=28;
        else if(i==4 || i==6 || i==9 ||i==11)day+=30;
        else day+=31;
       }
       return day+=Integer.parseInt(date.substring(8,10));
    }
}