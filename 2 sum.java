class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 1.bruteforce
         int []a=new int[2];
        // for(int i=0;i<numbers.length;i++)
        // {
        //     for(int j=i+1;j<numbers.length;j++)
        //     {
        //         if(numbers[i]+numbers[j]==target)
        //         {
        //             a[0]=i+1;
        //             a[1]=j+1;
        //             break;
        //         }
        //     }
        // }
        // return a;

        //2.hashmap

        //3.Two pointers
        int i=0,j=numbers.length-1;
        while(i<j)
        {
            if(numbers[i]+numbers[j]==target)
            {
                a[0]=i+1;
                a[1]=j+1;
                return a;
            }
            else if(numbers[i]+numbers[j]<target)//ascending order
                i++;
            else if(numbers[i]+numbers[j]>target)
                j--;
        }
        return a;
    }
}
