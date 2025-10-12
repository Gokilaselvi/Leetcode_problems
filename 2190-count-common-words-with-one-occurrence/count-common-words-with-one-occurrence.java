class Solution {
    public int countWords(String[] words1, String[] words2) {
       Set <String>word1=new HashSet<>();
        Set <String>word2=new HashSet<>();
        Map <String,Integer>map1=new HashMap<>();
        for(String s:words1){
            map1.put(s,map1.getOrDefault(s,0)+1);
        }
        for(String ele:map1.keySet()){
            if(map1.get(ele)==1)word1.add(ele);
        }
        Map <String,Integer>map2=new HashMap<>();
        for(String s:words2){
            map2.put(s,map2.getOrDefault(s,0)+1);
        }
        for(String ele:map2.keySet()){
            if(map2.get(ele)==1)word2.add(ele);
        }

        int count=0;
        for( String s:word1){
            if(word2.contains(s)){
               
                count++;
            }
        }
       return count;
    }
}