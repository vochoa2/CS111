/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Victor Ochoa
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {

        double[] copyOfArray = new double[array.length];

        for(int i = 0; i < copyOfArray.length; i++){
            copyOfArray[i] = array[i];
        }

        return copyOfArray;

    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
        //Modifying array of x and y coordinates directly based on way test
        // cases work
        for(int i = 0; i < x.length; i++){
            x[i] = alpha * x[i];
            y[i] = alpha * y[i];
        }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for(int i = 0; i < x.length; i++){
            x[i] = x[i] + dx;
            y[i] = y[i] + dy;
        }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
        for(int i = 0; i < x.length; i++){
            x[i] = x[i] * Math.cos(theta) - y[i] * Math.sin(theta);
            y[i] = y[i] * Math.cos(theta) + x[i] * Math.sin(theta);
        }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    }
}
