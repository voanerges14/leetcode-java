class Solution {

    public int rob(int[] nums) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even = Math.max(nums[i] + even, odd);
            } else {
                odd = Math.max(odd +  nums[i], even);
            }
        }
        return Math.max(even, odd);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rob(new int[]{5, 2, 1, 3, 6, 6, 6, 5}));
    }
}