public class CellPosition{
    public static void main(String[] args) {
        //Traverse a grid with two for loops
        int rows = 4; // 1 op
        int columns = 4; // 1 op
        //the scope of rows is anywhere within the main method

        //1 op for r = 1
        //rows + 1 for i<= rows
        // 1++ happens rows times 
        for (int i = 1; i <= rows; i++) { // iterate rows; 
            //the scope of i is only within the body of this for loop

            // j = 1 happens rows times 
            // j <= columns happens columns + 1 times * rows times
            // j ++ 1 operation * columns  * rows 
            for (int j = 1; j <= columns; j++) { 
                //the scope of j is only the inner loop!

                //1 operation * columns * rows
                System.out.print(i + "," + j + " "); // iterate columns

            }

            //1 operation * rows 
            System.out.println();
        }

        // 1 + 1 + 1  + n + 1 + n + n + 
    }
}