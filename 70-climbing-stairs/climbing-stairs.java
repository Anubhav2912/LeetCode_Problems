class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int prevState = 2;
        int prePrevState = 1;
        int currState = 0;
        for(int i = 3; i <= n; i++){
            currState = prevState + prePrevState;
            prePrevState = prevState;
            prevState = currState;
        }
        return currState;
    }
}