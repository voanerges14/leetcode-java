import java.util.Arrays;

public class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) { return image; }
        floodFill(sr, sc, image[sr][sc], newColor, image);
        return image;
    }

    private void floodFill(int sr, int sc, int color, int newColor, int[][] image) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color) {
            return;
        }
        image[sr][sc] = newColor;
        floodFill(sr + 1, sc, color, newColor, image);
        floodFill(sr - 1, sc, color, newColor, image);
        floodFill(sr, sc + 1, color, newColor, image);
        floodFill(sr, sc - 1, color, newColor, image);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out
                .println(Arrays.deepToString(
                        solution.floodFill(new int[][]{{0,0,0}, {0,0,0}}, 0, 0, 2)));
    }
}
