
☑️DOCUMENTING DSA:

Array partition (Medium)



Problem:

Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

https://leetcode.com/problems/array-partition/



🧠Approach 1: Using sorting

Idea:
Given array nums of 2n integers, we need to group these integers into n pairs and return the maximized sum from it. Here, first we need to sort the array. After sorting, minimum number in a pair will be at every even index. Adding these elements, we get the maximized sum.

Algorithm:
Sort the array.
Initialize a variable with 0 to store the res.
Add the elements at even indexes, store it in res and return it.

public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length % 2 != 0)
            return 0;
        Arrays.sort(nums);
        int sum = 0;
        
        for (int i = 0; i < nums.length; i += 2) 
            sum += nums[i];
        
        return sum;
    }

⏳Analysis:

Time complexity: O(n log n)         O(nlogn) + O(n) = O(2nlogn) = O(nlogn)
Space complexity: O(1)


🧠Approach 2: Using count sort
The approach is to use a counting sort to reduce time complexity to O(n).

Algorithm:

Create an array count to store the count of each element.
Create a variable min which will be true in starting, and then false and alternatively will change as we will encounter an element.
While min is true , just  keep adding i-10000 to the sum.
At last return sum.










⏳Analysis:
Time complexity: O(n)
Space complexity: O(1)




Please do a dry run of the code on a paper.You will be able to understand what is happening.
Thank you for reading till end.
If you like kindly retweet the first and share your feedback!✨














class Solution {
    
    public int[] countingSort(int[] nums){
        //To handle positive and negative integers.
        int[] count = new int[20001];
        for(int i=0; i<nums.length; i++){
            count[nums[i]+10000]++; //+10000 maintains the order of -ve numbers.
        }
        int index = 0;
        int num = 0;
        for(int i=0; i<count.length; i++){
            if(index == nums.length) break;
            if(count[i] == 0) continue;
            if(i < 10000) num = (10000-i)*(-1); //If number is negative.
            if(i >= 10000) num = (i-10000); //If number is positive.
            for(int j=0; j<count[i]; j++){
                nums[index++] = num;
            }
        }
        return nums;
    }
    
    public int arrayPairSum(int[] nums) {
        nums = countingSort(nums);
        int sum = 0;
        // Since array is sorted, minimum number in a pair will be at every even index.
        for(int i=0; i<nums.length; i+=2){
            sum += nums[i];
        }
        return sum;
    }
}


O(n log n)
O(1)






class Solution {
    public int arrayPairSum(int[] nums) {
        int result=0;
        int n = nums.length>>1;
        int[] bucket = new int[20001];
        for(int num:nums){
            bucket[num+10000]+=1;
        }
        int i=0;
        while(n-- > 0){
            while(bucket[i]==0) i++;
            result += (i-10000);
            bucket[i]--;
            while(bucket[i]==0) i++;
            bucket[i]--;
        }
        return result;
    }
}









class Solution {
    public int arrayPairSum(int[] nums) 
    {
        //Doing using count sort
        //The range of nums[i] is -10^4 <= nums[i] <= 10^4
        //So the count array will be of size 10^4+10^4+1  +1 for zero
        int count[] = new int[20001];
        
        //now lets fill the count array
        //count array will contain the number of occurrences of the number that is equal to its index-10000
        //for example the number -10000 will be stored in index -10000+10000 i.e. 0
        //and number 10000 will be stored in index 10000+10000 i.e. 20000
        
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]+10000]++;
        }
        
        //Now have filled the count array 
        
        //as we know the index of the array are : 0 , 1 , 2 , 3 ......20001
        //already in ascending order 
        //Lets take an example ;
        // nums = [6,2,6,5,1,2] will be stored like:
        // .. 10000 10001 10002 10003 10004 10005 10006  10007 ....
        //   ..  0    1    2       0    0     1     2      0 ..
        //we can get numbers in ascending order from here , as we can see 
        //now we want min number to be added in sum
        //so lets take a variable min which will be true in starting , and then false and alternatively will change as we will encounter an element 
        boolean min=true;
        int sum=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
               if(min) 
                   {
				   sum=sum+i-10000;
				   }
                count[i]--;
                min=!min;
            }
        }
        return sum;
    }
}