class Solution {

    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        char [] chars = new char[n];

        for (int i = 0; i < n; i++) {
            chars[indices[i]] = s.charAt(i);
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.restoreString("aiohn", new int[]{3,1,4,2,0}));
    }
}