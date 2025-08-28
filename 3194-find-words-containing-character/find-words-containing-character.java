class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer>res=new ArrayList<>();
        int i=0;
        for(String str:words){
            String s=Character.toString(x);
            if(str.contains(s))res.add(i);
            i++;
        }return res;
    }
}