class Solution {
    public int climbStairs(int n) {
        //base case
        //edge case
        //all possible cases
        //sum/min of all
        //fibonacci prob this becomes

        //base case
        if(n==0)    return 1;//qs is find no. of ways to climb nth stairs...shraddha di said 0 par 1 way, 1 par bhi 1 way
        if(n==1)    return 1;

        int left=climbStairs(n-1);
        int right=climbStairs(n-2);

        return left+right;
    }
}
