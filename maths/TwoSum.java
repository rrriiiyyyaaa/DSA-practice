class Solution {  
    public int[] twoSum(int[] nums, int target) {
        for(int i =0; i<nums.length;i++)
        {
            for(int j= i+1;j<nums.length;j++)
            {
                if(nums[i] +nums[j] == target)
                return new int[] {i,j};
            }
        }
    }
}

/*
Ex- {2,7,11,15}
start with i=0, i.e., 2
2+j(7)==9 (target)
return the indices of these two numbers as an array

*/
