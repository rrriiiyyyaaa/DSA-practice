class Solution{
	public int climbStairs(int n){
		if(n<=2)
			return n;
		else
			return climbStairs(n-1) + climbSttairs(n-2);
	}
}

/*
We're using recursion approach here.
Ex: n=4
return 3+2=5 steps
a) 1+1+1+1: 1 way
b) 1+2+1: 2 way
c)2+1+1: 3 way
d) 1+1+2: 4 way
e) 2+2: 5 way

*/