//MAX SUBARRAY SUM DISPLAY- APPLIACTION OF EACH TECHNIQUE
//M1:BRUTEFORCE
/*
class Solution {
    public int maxSubArray(int[] nums) {
//Maximum subarray Sum
    //M1:BRUTEFORCE - O(n^3)
        int max=Integer.MIN_VALUE;//max_sum
        int saum=0,n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=nums[k];
                }
                if(max<sum) 
                    max=sum;
            }
        }
    //M2:PREFIX SUM
    //M3:KADANE'S ALGORITHM

    return max;
    }
}*/
//M2:BETTER---VVIP---(PREFIX SUM)
//M3:BEST
