class Solution {  
    public int[] twoSum(int[] nums, int target) {
        /*
        brute force
        for(int i =0; i<nums.length;i++)
        {
            for(int j= i+1;j<nums.length;j++)
            {
                if(nums[i] +nums[j] == target)
                return new int[] {i,j};
            }
        }
        */
        //fill haSHMAP
       HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],i);
        }
        //search
        for(int i=0;i<nums.length;i++)
        {
            int num= nums[i];
            int rem= target-num;

            if(hm.containsKey(rem))
            {
            int remind = hm.get(rem);
            if(remind == i) continue;
            return new int[] {i,remind};
            }
        }
        return new int[] {};
    }
}