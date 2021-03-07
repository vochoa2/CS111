public class TwoDArrayFall2020Exam {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        int[][] twoDBoy = new int[n][n];

        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                twoDBoy[r][c] = StdIn.readInt();
            }
        }

        for (int c = n - 1; c >= 0; c--) {
            for (int r = n - 1; r >= 0; r--) {
                StdOut.print(twoDBoy[r][c] + " ");
            }
            StdOut.println();
        }
    }
}
