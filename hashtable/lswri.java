class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map= new Hashmap<>();
        int start=0;
        int len=0;

        for(int end=0;end<s.length();end++)
        {
            char c = s.CharAt(end);
            if(map.containsKey(c)){
            if(start<=map.get(c)){
                start=start+map.get(c);
            }
            }
            len=Math.max(len,end-start+1);
            map.put(c,end)l;
        }
        return len;

    }
}