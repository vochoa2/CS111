public class Ramanujan {
    public static void main(String args[]){
        //1729 is the smallest number expressible as the sum of 
        // two cubes in two different ways

        //Verify by taking in n and prints all integers less than or equal to n
        // that can be expressed as the sum of two cubes in two different ways

        int n = Integer.parseInt(args[0]);
        int lastSumOfCubes = 0;
        //Tracks last calculated sum for redundancies

        //Hint use four nested loops to find distinct integers a, b, c, d such
        // that a^3 + b^3 = c^3 + d^3


        //I choose to cap the integers at 12 as the cube root of 1729 is ~12.002
        // so the highest integer cubed without going over 1729 is 12. This is necessary
        // as we are adding TWO cubed integers together. 13^3 would mean we need
        // to subtract a number from it.

        for(int a = 0; a <= 12; a++){
            for (int b = 0; b <= 12; b++) {
                for (int c = 0; c <= 12; c++) {
                    for (int d = 0; d <= 12; d++) {

                        int sumOfCubes1 = (int)(Math.pow(a, 3) + Math.pow(b, 3)); //LHS
                        int sumOfCubes2 = (int)(Math.pow(c, 3) + Math.pow(d, 3)); //RHS

                        //Compare LHS to RHS, check integers distinct, check the sum is less than n
                        if((sumOfCubes1 == sumOfCubes2) && (lastSumOfCubes != sumOfCubes1)){ 
                            if(a != b && b != c && c != d && a != c && a != d && b != d){
                                if(sumOfCubes1 <= n){
                                    System.out.println(sumOfCubes1);
                                    lastSumOfCubes = sumOfCubes1;

                                }
                            }
                        }
                    }
                }
            }
        }

        //Outputs 1729 8 times. This happens because there is 4 unique ways to arrange
        // the left side of the equation and after that only 2 unique ways to arrange
        // the right side. So 4*2 = 8

        //Fix attempt: create a variable that remembers the last sum of cubes 
        // as to not repeat different combintations of the same 4 integers.
    }
    
}
