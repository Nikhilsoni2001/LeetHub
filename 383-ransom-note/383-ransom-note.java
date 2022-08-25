class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char m: magazine.toCharArray()) {
            map.put(m, map.getOrDefault(m, 0) + 1);
        }
        
        for(char r: ransomNote.toCharArray()) {
            if(!map.containsKey(r) || map.getOrDefault(r, 0) <= 0) return false;
            
            map.put(r, map.getOrDefault(r, 0) - 1);
        }
        return true;
    }
}