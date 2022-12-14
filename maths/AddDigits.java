class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }
}

/*
Example: 27 and all the multiples of 9
After adding 2+7, 9 is the ans which is single digit
Ex: 42
4+2=6
After dividing 42 by 9, we see the the remainder is 6(which is the logic)
Similarly in other cases too
*/