class Solution {
    public boolean judgeSquareSum(int n) {
         int root = (int) Math.sqrt(n);
        long low = 0;
        long high = root;
        
        while(low<=high){
           long sum = (low*low)+(high*high);
            if(sum==n){
                return true;
            }
            if(sum>n){
                high--;
            }
            else{
                low++;
            }
        }
        
        return false;
    }
}