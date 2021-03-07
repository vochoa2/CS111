public class ThousandIntegers {
    public static void main(String[] args) {
        //Print integers from 1000 to 2000 with five ints per line
        //Using one for loop and one if statement
        /*
        for(int i = 1_000; i <= 2_000; i++){
            if(i % 5 == 0) System.out.println();

            System.out.print(i + " ");
        }
        */

        //Rewriting for mutability? and taking into consideration the constants of the program:

        int START = 1_000;
        int END = 2_000;
        int PER_LINE = 5;

        for( int i = START; i <= END; i++){
            if(i % PER_LINE == 0) System.out.println();

            System.out.println(i + " ");
        }
    }
    
}
