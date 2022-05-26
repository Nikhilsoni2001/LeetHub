class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(i < arr.length && arr[i] != arr[correct]) swap(arr, i, correct); 
            else i++;
        }
        
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1) list.add(j+ 1);
        }
        
        return list;
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}