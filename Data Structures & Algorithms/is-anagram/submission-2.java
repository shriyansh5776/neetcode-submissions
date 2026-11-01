class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> h1 = new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();
        char[] st = s.toCharArray();
        char[] tt = t.toCharArray();
        if(st.length!=tt.length) return false ;
        for(int i = 0 ;i<s.length();i++){
            h1.put(st[i],h1.getOrDefault(st[i],0)+1);
            h2.put(tt[i],h2.getOrDefault(tt[i],0)+1);
        }
        if(h1.equals(h2)) return true ;
        else return false; 
    }
}
