public class Solution {

    public int countDigitOne(int n) {
        int count = 0;
        for (long m = 1; m <= n; m *= 10) {
            count += (n / m + 8) / 10 * m + (n / m % 10 == 1 ? n % m + 1 : 0);
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countDigitOne(120));
    }
}
