class Solution {
    public int[] countBits(int n) {
        int[] sol = new int[n+1];
        for(int i = 0; i <= n; i++){
            sol[i] = sol[i>>1] + (i&1);
        }
        return sol;        
    }
}