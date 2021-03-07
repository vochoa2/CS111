/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author:
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    int n = Integer.parseInt(args[0]);
    int x, y; x = y = 0;
    System.out.println(("(0,0)"));

    for (int i = 0; i < n; i++) {
        //Parenthesis around random * 4, else (int) random happens first and value
        //is always 0!
        int r = (int) (Math.random() * 4);

        if(r < 1){
            y += 1;
        } else if (r < 2){
            x += 1;
        } else if (r < 3){
            y -= 1;
        } else {
            x -= 1;
        }

        System.out.println("(" + x + ", " + y + ")");
        
    }

    double squareDistance = x*x + y*y;
    System.out.println("Squared distance = " + squareDistance);
    }
}
