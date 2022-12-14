class Solution{
	public int climbStairs(int n){
		if(n<=2)
			return n;
		else
			return climbStairs(n-1) + climbStairs(n-2);
	}
}

/* TLE
We're using recursion approach here.
Ex: n=4
return 3+2=5 steps
a) 1+1+1+1: 1 way
b) 1+2+1: 2 way
c)2+1+1: 3 way
d) 1+1+2: 4 way
e) 2+2: 5 way

*/

public int climbStairs(int n) {
    int[] dp = new int[n + 1]; // save all caculated values
    dp[0] = 1; // base case
    dp[1] = 1; // base case
    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
}
