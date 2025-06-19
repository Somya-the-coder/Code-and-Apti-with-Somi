class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //optimal-2 pointers in 3 sum-O(n^2)..................bruteforce 3 loops(O(n^3))
        Set<List<Integer>> res=new HashSet<>();
        int n=nums.length;
        if(n==0)  return new ArrayList<>(res);

        Arrays.sort(nums);

        for(int i=0;i<n-2;i++)
        {
            int j=i+1;//visualize
            int k=nums.length-1;//visualize pic
            while(j<k)//new line, than 2 sum ka code
            {
            {
                int sum=nums[j]+nums[k];//simple
                if(sum==-nums[i])
                {
                    res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));}
                    else if(sum> -nums[i]) k--;//2 sum
                    else if(sum< -nums[i])  j++;//2 sum concept
                }
            }
        return new ArrayList<>(res);
    }
}
