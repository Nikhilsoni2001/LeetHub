class Solution {
    public int romanToInt(String s) {
        int res = 0, n = s.length();
        for(int i = 0; i < n - 1; i++) {
            int a = getValue(s.charAt(i));
            int b = getValue(s.charAt(i+1));
            if(a < b) res -= a;
            else res += a;
        }
        return res += getValue(s.charAt(n - 1));
    }
    
    int getValue(char c) {
        switch(c) {
                case 'I': return 1;
                case 'V': return 5; 
                case 'X': return 10; 
                case 'L': return 50; 
                case 'C': return 100; 
                case 'D': return 500; 
                default: return 1000;
            }
    }
}