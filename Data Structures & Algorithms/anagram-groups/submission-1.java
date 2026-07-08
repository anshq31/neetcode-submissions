class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sor = new String(ch);
            map.putIfAbsent(sor,new ArrayList<>());
            map.get(sor).add(s);
        }

        return new ArrayList<>(map.values());    
    }
}
