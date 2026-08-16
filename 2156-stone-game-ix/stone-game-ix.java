class Solution {
    public boolean stoneGameIX(int[] stones) {
        int zero = 0, one = 0, two = 0;

        for (int x : stones) {
            if (x % 3 == 0) zero++;
            else if (x % 3 == 1) one++;
            else two++;
        }

        if (zero % 2 == 0)
            return one > 0 && two > 0;

        return Math.abs(one - two) > 2;
    }
}