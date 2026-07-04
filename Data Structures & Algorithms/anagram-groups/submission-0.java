class Solution {
    public List<List<String>> groupAnagrams(String[] nums) {
          Map<String, List<String>> map = new HashMap<>();

          for(String s : nums){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sor = new String(ch);
            map.putIfAbsent(sor, new ArrayList<>());
            map.get(sor).add(s);
          }

          return new ArrayList<>(map.values());
    }
}