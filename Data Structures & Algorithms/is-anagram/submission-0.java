class Solution {
    public boolean isAnagram(String s, String t) {
        int[] val=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            val[s.charAt(i)-'a']++;
            val[t.charAt(i)-'a']--;
        }

        for(int num:val){
            if(num!=0){
                return false;
            }
        }
        return true;
        

    }
}
