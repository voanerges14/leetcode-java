class Solution {

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            byte pop = (byte) (x % 10);
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            result = result * 10 + pop;
            x /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(1534236469));
        System.out.println(solution.reverse(-6547));
    }
}