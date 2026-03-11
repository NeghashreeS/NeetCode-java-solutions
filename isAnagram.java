
class Solution {
    public boolean isAnagram(String s, String t)
{
    int freq[]=new int[26];
    int j;
    if(s.length()!=t.length()){
        return false;
    }
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        freq[ch-'a']++;
    }
        for(j=0;j<t.length();j++){
            char ch=t.charAt(j);
            freq[ch-'a']--;
        }
            for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
        }
}
