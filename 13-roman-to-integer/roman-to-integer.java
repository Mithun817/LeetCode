class Solution {
    public int romanToInt(String s) {
        int length = s.length();
        int value = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'I') {
                if (i < length - 1) {
                    if ((s.charAt(i + 1) == 'V') || (s.charAt(i + 1) == 'X')) {
                        value -= 1;
                    } else
                        value += 1;
                } else
                    value += 1;
            } else if (s.charAt(i) == 'V')
                value += 5;
            else if (s.charAt(i) == 'X') {
                if (i < length - 1) {
                    if ((s.charAt(i + 1) == 'L') || (s.charAt(i + 1) == 'C')) {
                        value -= 10;
                    } else
                        value += 10;
                } else
                    value += 10;

            } else if (s.charAt(i) == 'L')
                value += 50;
            else if (s.charAt(i) == 'C') {
                if (i < length - 1) {
                    if ((s.charAt(i + 1) == 'D') || (s.charAt(i + 1) == 'M')) {
                        value -= 100;
                    } else
                        value += 100;
                } else
                    value += 100;

            } else if (s.charAt(i) == 'D')
                value += 500;
            else if (s.charAt(i) == 'M')
                value += 1000;
        }
        return value;
    }
}