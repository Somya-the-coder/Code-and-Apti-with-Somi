class Solution {
    public int maxProfit(int[] prices) {
        
        //DP is rememberingg the past, dp on subsequence,grids,string done...now dp on stock ka pehla question(space optimization prob upcoming), go sequence-wise
        //start from i, and that's the sell, on its lhs find & keep storing the min value and minus and stote profit somewhere too
        int min=prices[0], maxprofit=0, l=prices.length;
        for(int i=1;i<l;i++)
        {
            int cost=prices[i]-min;
            maxprofit=Math.max(maxprofit,cost);
            min=Math.min(min,prices[i]);
        }
        return maxprofit;
    }
}
