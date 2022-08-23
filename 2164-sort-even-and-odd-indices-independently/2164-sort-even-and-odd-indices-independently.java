class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) even.add(nums[i]);
            else odd.add(nums[i]);
        }
        
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        
        int i = 0, eveni = 0, oddj = 0;
        while(eveni < even.size() || oddj < odd.size()) {
            if(eveni < even.size())
                nums[i++] = even.get(eveni++);
            if(oddj < odd.size())
                nums[i++] = odd.get(oddj++);
        }
        return nums;
    }
}