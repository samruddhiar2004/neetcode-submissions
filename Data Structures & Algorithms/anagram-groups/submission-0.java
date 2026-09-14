class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagramMap=new HashMap<>();
        for(String word:strs){
            char[]ch=word.toCharArray();
            Arrays.sort(ch);
            String sortedKey=new String(ch);

            anagramMap.putIfAbsent(sortedKey,new ArrayList<>());
            anagramMap.get(sortedKey).add(word);
        }

        return new ArrayList<>(anagramMap.values());
        
    }
}
