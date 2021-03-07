public class BreakContinue{
    public static void main(String[] args) {
        //break, BREAKS out the loop
        //continue, continues to the next iteration ignoring everything else
        //in the current iteration

        for( int i = 1; i <= 5; i++ ){
            if ( i == 3 ) continue;
            //if continue execution goes from here to i++!

            System.out.println(i);
        }

        //If break, execution continues here

        //breaking and continue is meh, can add confusion yee yee

        //with nested loops
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 1) break;
                System.out.println(i + " " + j);
                
            }
        }

        //in nested loops, break only BREAKS out of the loop it's in
        // in this case only out of the inner j loop
        
    }
}