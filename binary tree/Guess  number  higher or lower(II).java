public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return cai(1,n);
    }    
    private int cai(int s, int e){
        int mid = s+(e-s)/2;
        //System.out.println(mid);
        if(guess(mid)==0) return mid;
        else if(guess(mid)>0) {mid=cai(mid+1,e);}
        else{mid = cai(s,mid);}
        return mid;
    }
}