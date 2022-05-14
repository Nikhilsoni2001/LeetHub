class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Node> list = new ArrayList<>();
        for(int i = 0; i < mat.length; i++) {
            int count = findStrength(mat[i]);
            list.add(new Node(i, count));
        }
        Collections.sort(list, (a,b) -> a.count - b.count);
        int[] resCount = new int[k];
        for(int i = 0; i < k; i++) {
            resCount[i] = list.get(i).val;
        }
        return resCount;
    }
    
    private static int findStrength(int[] arr) {
        int i = 0, j = arr.length - 1;
        while(i <= j) {
            int mid = i + (j - i) / 2;
            if(arr[mid] == 0) j = mid - 1;
            else i = mid + 1;
        }
        return i;
    }
    
    class Node{
        int val, count;
        Node(int val, int count) {
            this.val = val;
            this.count = count;
        }
    }
}