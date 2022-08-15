class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i <= j) {
            char f = s.charAt(i);
            char l = s.charAt(j);
            if(!Character.isLetterOrDigit(f)) {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(l)) {
                j--;
                continue;
            }
            if(Character.toLowerCase(f) != Character.toLowerCase(l)) return false;
            i++;
            j--;
        }
        return true;
    }
}