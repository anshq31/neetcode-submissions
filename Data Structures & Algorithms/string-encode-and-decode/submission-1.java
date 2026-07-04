class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> list = new ArrayList<>();
        int i = 0;

        while(i<s.length()){
            int j  = i;
            while(s.charAt(j)!='#'){
                j++;
            }

            int length = Integer.parseInt(s.substring(i,j));
            j++;
            list.add(s.substring(j,j+length));
            i = j+length;
        }

        return list;
    }
}
