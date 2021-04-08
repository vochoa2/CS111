 /*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author: Victor Ochoa
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {
        if(n == 0) return original;

        return original + appendNTimes(original, n - 1);
    }

    public static void main (String[] args) {

        StdOut.println(appendNTimes("cat", 0));
        StdOut.println(appendNTimes("cat", 1));
        StdOut.println(appendNTimes("cat", 2));   
    }
}
