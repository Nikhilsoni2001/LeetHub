class Solution {
    private int lo, maxLen;
    
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 2) return s;
        int start = 0, end = 0;
        
        for(int i = 0; i < s.length() - 1; i++) {
            expandFromMiddle(s, i, i);
            expandFromMiddle(s, i, i+1);
        }
        return s.substring(lo, lo + maxLen);
    }
    
    public void expandFromMiddle(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (maxLen < right - left - 1) {
		    lo = left + 1;
		    maxLen = right - left - 1;
	    }
    }
}