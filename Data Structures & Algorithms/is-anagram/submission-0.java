class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char ch : t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        for(int num : map.values()){
            if(num!=0) return false;
        }
        return true;
    }
}
