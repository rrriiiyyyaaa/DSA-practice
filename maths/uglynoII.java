class Solution {
    public int nthUglyNumber(int n) {
       int[] ugly = new int[n];
    ugly[0] = 1;
    
    int c2 = 0, c3 = 0, c5 = 0;
    
    for (int i = 1; i < n; i++) {
        while (ugly[c2] * 2 <= ugly[i-1]) {
            c2++;
        }
        while (ugly[c3] * 3 <= ugly[i-1]) {
            c3++;
        }
        while (ugly[c5] * 5 <= ugly[i-1]) {
            c5++;
        }
        
        ugly[i] = Math.min(ugly[c2] * 2, Math.min(ugly[c3] * 3, ugly[c5] * 5));
    }

    return ugly[n-1];    

    }
}