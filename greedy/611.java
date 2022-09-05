☑️DOCUMENTING DSA:

Valid Triangle Number

Problem:

Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

https://leetcode.com/problems/valid-triangle-number/

A triangle is valid only if sum of any two sides is larger than the third side


🧠BRUTE FORCE APPROACH: (tle)
Idea: 
This is quite straight forward using this approach simply checking the above solution.

⏳Analysis:
Time complexity: O(n³)
Space complexity: O(1)

🧠OPTIMAL APPROACH:

Idea:

Make two pointers left and right and iterating the loop assuming i as the longest side, left=0 and right as i-1. Check if nums[left]+nums[right]>i , we update the ans by adding right-left to ans else increment left.

DRY RUN ON PAPER ONCE FOR EASY UNDERSTAND

Algorithm: 

Sort the given input.
We don't have to go through the middle number from left to right
because we sort the nums at first!
Hence we increment our count by right-l .
If they are not valid triangle numbers, increment left by one.
After we finish the outer for loop, we will get the total number of valid triangle numbers


⏳Analysis:
Time complexity: O(n²)
Space complexity: O(1)

A quick summary:

https://medium.com/@recursiveRiya/valid-triangle-number-a0167f4a2c67


Please do a dry run of the code on a paper.You will be able to understand what is happening.
Thank you for reading till end.
If you like kindly retweet the first and share your feedback!✨
