class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while(start <= end) {
            int res = numbers[start] + numbers[end];
            if(res == target) return new int[] {start+1, end+1};
            else if(res < target) start++;
            else end--;
        }
        return new int[] {-1,-1};
    }
}