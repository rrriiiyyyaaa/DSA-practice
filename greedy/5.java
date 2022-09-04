☑️DOCUMENTING DSA:

Longest Palindromic Substring
(Medium)


Problem:

Given a string s, return the longest palindromic substring in s.

https://leetcode.com/problems/longest-palindromic-substring/

🧠Brute force approach:

Idea:
The brute force approach is to start from each character and check for all substrings from that character if it is palindrome or not.

png bf5

⏳Analysis:

Time complexity: O(n³)
Space complexity: O(1)



🧠 OPTIMIZED APPROACH:
Idea:
This approach executes by expanding the string at center and check for palindrome. This way, we optimize for not finding one, but instead to detect there's no palindrome and exit.

png om

⏳Analysis: 
Time complexity: O(n²)
Space complexity: O(1)


🧠 DP approach:

Idea:
For the string to be palindrome:
1. Boundary elements must be equal.
2. Non boundary substring should be palindromic.

⏳Analysis:
Time complexity: O(n²)
Space complexity: O(1)


Here's a quick summary:

https://medium.com/@recursiveRiya/5-longest-palindromic-substring-108c676937ed


Please do a dry run of the code on a paper.You will be able to understand what is happening.
Thank you for reading till end.
If you like kindly retweet the first and share your feedback!✨
