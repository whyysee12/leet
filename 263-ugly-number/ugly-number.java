class Solution {
    public boolean isUgly(int n) {
        if (n == 1)
            return true;

        boolean bool = true;
        if(n<=0) return false;
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                continue;
            } else if (n % 3 == 0) {
                n = n / 3;
            } else if (n % 5 == 0) {
                n = n / 5;
            } else {
                bool = false;
                break;
            }

        }
        return bool;

    }
}