class Solution {
    public boolean isUgly1(int num) {
        if (num < 1) return false;
        while (num > 1) {
            if (num % 5 == 0) { num /= 5; }
            else if (num % 3 == 0) { num /= 3; }
            else if (num % 2 == 0) { num >>= 1; }
            else { return false; }
        }
        return true;
    }

    public boolean isUgly2(int num) {
        for (int factor = 2; factor < 6 && num > 0; factor++) {
            while (num % factor == 0) {
                num /= factor;
            }
        }
        return 1 == num;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long start = System.nanoTime();
        System.out.println(solution.isUgly1(15));
        System.out.println(System.nanoTime() - start);

        start = System.nanoTime();
        System.out.println(solution.isUgly2(15));
        System.out.println(System.nanoTime() - start);

    }
}