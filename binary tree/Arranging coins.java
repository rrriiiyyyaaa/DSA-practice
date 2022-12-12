/*
k is thee no. of rows which filled. If the row isn't filled return k-1 (which is completely filled)

Complexity
Time complexity:
O(n)
Space complexity:
O(1)
*/

class Solution{
    public int arrangeCoins(int n) {
        int k =0;
        while(n>0)
        {
            k++;
            n= n-k;
        }
        return n==0? k : k-1;

    }
}