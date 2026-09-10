class Solution {
    public boolean isAnagram(String s, String t) {
        int [] freq=new int [256];
        for(char ch :s.toCharArray()){
            freq[ch-'a']++;

        }
        for(char c:t.toCharArray()){
            freq[c-'a']--;
        }
       
       for(int i=0;i<freq.length;i++){
        if(freq[i]!=0){
            return false;
        }
       }
        return true;

    }
}
