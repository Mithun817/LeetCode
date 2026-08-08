class Solution {
    public boolean canAliceWin(int n) {
        int rem = 10, turn = 1;
        while(n>=rem)
        {
            n -= rem--;
            turn ++;
        }
        return turn % 2 == 0;
    }
}