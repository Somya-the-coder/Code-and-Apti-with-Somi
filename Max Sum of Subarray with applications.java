//MAX SUBARRAY SUM DISPLAY- APPLIACTION OF EACH TECHNIQUE
class Solution {
    public int maxSubArray(int[] nums) {
//Maximum subarray Sum
    //M1:BRUTEFORCE - O(n^3)
        int max=Integer.MIN_VALUE;//max_sum
        int sum=0,n=nums.length;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i;j<n;j++)
        //     {
        //         sum=0;
        //         for(int k=i;k<=j;k++)
        //         {
        //             sum+=nums[k];
        //         }
        //         if(max<sum) 
        //             max=sum;
        //     }
        // }
    //M2:NOT PREFIX SUM(not meant for this question) BUT LESS TC- O(N^2)
        // for(int i=0;i<n;i++)
        // {
        //     sum=0;
        //     for(int j=i;j<n;j++)
        //     {
        //         sum+=nums[j];

        //     if(max<sum)
        //         max=sum;
        //     }
        // }
    //M3:KADANE'S ALGORITHM - simple rule carry sum right from 1st elt if sum is -ve, make sum 0 and again count, cauz a no. giving -ve sum has no significance for me
    for(int i=0;i<n;i++) - O(1), SC=O(1)
    {
        sum+=nums[i];
        if(sum>max)
            max=sum;
        
        if(sum<0)
            sum=0;//proof: dryrun and see
    }
    return max;
    }
}
