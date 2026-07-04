class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }

        char[] ch = sb.toString().toCharArray();
        
        for(int i =0;i<ch.length/2;i++){
            if(ch[i]!=ch[ch.length-1-i]){
                return false;
            }
        }

        return true;
    }
}
