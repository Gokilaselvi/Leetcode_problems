class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Set<String> s1Words = new HashSet<>();
        Set<String> s2Words = new HashSet<>();
        Set<String> removedWords = new HashSet<>();
        String[] s1Split = s1.split(" ");
        String[] s2Split = s2.split(" ");

        for(String s : s1Split)
            if(!s1Words.add(s))
                removedWords.add(s);

        for(String s : s2Split)
            if(!s2Words.add(s))
                removedWords.add(s);
        
        List<String> result = new ArrayList<>();

        for(String s : s1Split)
            if(!s2Words.contains(s) && !removedWords.contains(s))
                result.add(s);

        for(String s : s2Split)
            if(!s1Words.contains(s) && !removedWords.contains(s))
                result.add(s);
        
        return result.toArray(new String[0]);
    }
}
