class Solution {
    public int smallestRangeII(int[] A, int k) {
        Arrays.sort(A); //sort the array
        int n = A.length;
        Arrays.sort(A);
        int ans = A[n-1]-A[0];
        for(int i=0;i<n-1;i++)
        {
            int j =i+1;
            int low = Math.min(A[0]+k ,A[j]-k);
            int high = Math.max(A[n-1]-k, A[i]+k);
            ans= Math.min(ans, high-low);
        }
        return ans;
        
    }
}

/*
Here's a quick explanation:
https://medium.com/@recursiveRiya/910-smallest-range-ii-a17ccf061ba5

*/