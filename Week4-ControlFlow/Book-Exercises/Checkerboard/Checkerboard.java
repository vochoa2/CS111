public class Checkerboard {
    public static void main(String args[]){
        //Takes an integer command-line argument n and uses a loop in loop to 
        //print out 2d n by n checkerboard pattern

        int n = Integer.parseInt(args[0]);

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n/2; j++) {
                if(i % 2 == 0){
                    System.out.print(" *");
                    System.out.print("  ");
                } else {
                    System.out.print("  ");
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
    
}
