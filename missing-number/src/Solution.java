class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int [] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[nums[i]] = nums[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.missingNumber(new int[]{8,6,4,2,3,5,7,0,1}));
        //TODO
    }
}