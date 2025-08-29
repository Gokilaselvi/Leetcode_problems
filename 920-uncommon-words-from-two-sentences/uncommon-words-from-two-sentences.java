class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
     List<String>list=new ArrayList<>();
     for(String s:s1.split(" ")){
     list.add(s);
    }for(String s:s2.split(" ")){
     list.add(s);
    }
    Collections.sort(list);
    List<String>arr=new ArrayList<>();
    int count;
    int len=list.size();
    String str;
    for(int i=0;i<len;i++){
        count=0;
        str=list.get(i);
        for(int j=i+1;j<len;j++){
            if(str.equals(list.get(j))){
            count++;
            }
        }i+=count;
        if(count<1){
            arr.add(str);
        }
    }//System.out.print(list);
    String [] arr1=arr.toArray(new String[arr.size()]);
    return arr1;
    }
}