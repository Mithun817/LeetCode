import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i : deck) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }

        int g = -1;
        for (int val : count.values()) {
            if (g == -1) {
                g = val;
            } else {
                g = gcd(g, val);
            }
        }

        return g >= 2;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}