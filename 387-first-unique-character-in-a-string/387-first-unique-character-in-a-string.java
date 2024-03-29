class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) map.put(ch, -1);
            else map.put(ch, i);
        }
        
        int min = Integer.MAX_VALUE;
        for(char c: map.keySet()) {
            if(map.get(c) > -1 && map.get(c) < min) min = map.get(c);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}