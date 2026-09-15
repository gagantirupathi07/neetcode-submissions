class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        int longs= 0;
        for(int num : nums) s.add(num);
        for(int num: s){
            if(s.contains(num-1)) continue;
            else{
                int current = num;
                int lenght=1;
                while(s.contains(current+1)){
                    current++;
                    lenght++;
                }
                longs=Math.max(longs,lenght);
            }
        }
        return longs;
    }
}
