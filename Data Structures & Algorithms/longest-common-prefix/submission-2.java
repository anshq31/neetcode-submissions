class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }

        String s = strs[0];

        for(int i = 1;i<strs.length;i++){
            String t = strs[i];
            int len = Math.min(s.length(),t.length());

            boolean noteq = false;
            for(int j = 0;j<len;j++){
                if(s.charAt(j) != t.charAt(j)){
                    s = s.substring(0,j);
                    noteq = true;
                    break;
                }
            }

            if(noteq == false){
                s = s.substring(0,len);
            }

            if (s.isEmpty()) {
                return "";
            }
        }

        return s;
    }
}