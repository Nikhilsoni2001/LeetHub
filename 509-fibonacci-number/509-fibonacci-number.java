class Solution {
    int[] fib = new int[31];
    public int fib(int n) {
        if(n <= 1) return n;
        else if(fib[n] != 0) return fib[n];
        return fib[n] = fib(n - 1) + fib(n - 2);
    }
}