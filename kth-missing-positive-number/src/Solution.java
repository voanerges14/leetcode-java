class Solution {
    public int findKthPositive(int[] arr, int k) {
        if (arr[0] > k) return k;
        int j = 0, missedI = 0;
        while (k > 0) {
            if (j == arr.length) return missedI + k;
            if (++missedI != arr[j]) { k--; }
            else { j++; }
        }
        return missedI;
    }

    public int findKthPositiveBetter(int[] arr, int k) {
        int l = 0, r = arr.length, m;
        while (l < r) {
            m = (l + r) / 2;
            if (arr[m] - 1 - m < k)
                l = m + 1;
            else
                r = m;
        }
        return l + k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findKthPositive(new int[]{2,3,4,7,11}, 5));
    }
}