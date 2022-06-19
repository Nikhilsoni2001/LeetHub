class Solution {
    public List<Integer> partitionLabels(String s) {
        if(s == null || s.length() == 0) return null;
        
        List<Integer> arr = new ArrayList<>();
        
        int[] last = new int[26];
        for(int i = 0; i < s.length(); i++)
            last[s.charAt(i) - 'a'] = i;
        
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if(i == end) {
                arr.add(end - start + 1);
                start = end + 1;
            }
        }
        return arr;
    }
}