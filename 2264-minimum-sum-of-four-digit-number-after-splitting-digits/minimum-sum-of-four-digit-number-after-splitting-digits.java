class Solution {
    public int minimumSum(int num) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<4 ;i++){
        list.add(num%10);
        num/=10;
        }
         Collections.sort(list);
         int num1= list.get(0)*10+list.get(3);
         int num2= list.get(1)*10+list.get(2);
         return num1+num2;
    }
}