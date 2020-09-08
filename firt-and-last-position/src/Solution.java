class Solution {

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int leftIndex = firstTargetedIndex(nums, target, true);
        if (leftIndex == nums.length || nums[leftIndex] != target) {
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        res[0] = leftIndex;
        res[1] = firstTargetedIndex(nums, target, false) - 1;
        return res;
    }


    private int firstTargetedIndex(int[] array, int target, boolean left) {
        int from = 0;
        int to = array.length;

        while (from < to) {
            int mid = (from + to) / 2;
            if (array[mid] > target || (array[mid] == target && left)) {
                to = mid;
            } else {
                from = mid + 1;
            }
        }
        return from;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] res = solution.searchRange(new int[]{5,7,7,8,8,10}, 6);
//        int[] res = solution.searchRange(new int[]{5, 7, 7, 8, 10, 11, 12, 13, 14}, 15);
        System.out.println("[" + res[0] + " , " + res[1] + "]");
    }
}
