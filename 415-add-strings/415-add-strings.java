class Solution {
    public String addStrings(String num1, String num2) {
        int n1 = num1.length() - 1, n2 = num2.length() - 1, sum = 0,carry = 0;
        StringBuilder sb= new StringBuilder();
        
        while(n1 >= 0 || n2 >= 0 || carry > 0) {
            sum = carry;
            if(n1 >= 0) sum += num1.charAt(n1--) - '0';
            if(n2 >= 0) sum += num2.charAt(n2--) - '0';
            
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}