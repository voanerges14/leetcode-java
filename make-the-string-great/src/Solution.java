class Solution {

    public String makeGood(String s) {

        char[] chars = s.toCharArray();
        byte size = (byte) chars.length;

        byte i = 0;
        while (i < size - 1) {
            if ((Math.abs(chars[i]- chars[i + 1]) == 32 && (size -= 2) > i)) {
                System.arraycopy(chars, i + 2, chars, i, size - i);
                if (i > 0) {i--;}
            } else { i++; }
        }
        return String.valueOf(chars, 0, size);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.makeGood("Pp"));
    }
}