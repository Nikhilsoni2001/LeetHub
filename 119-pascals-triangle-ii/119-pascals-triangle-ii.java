class Solution {
    public List<Integer> getRow(int i) {
        ArrayList<Integer> arr = new ArrayList<>();
        long val = 1;
        for(int j = 0; j <= i; j++) {
            arr.add((int)val);
            val =  val * (i-j)/(j+1);
        }
        return arr;
    }
}