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
        //Transform theta into radians, as Math.cos and Math.sin take radians
        theta = (theta) * (Math.PI / 180);
        for(int i = 0; i < x.length; i++){
            x[i] = x[i] * Math.cos(theta) - y[i] * Math.sin(theta);
            y[i] = y[i] * Math.cos(theta) + x[i] * Math.sin(theta);
        }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

        StdDraw.setScale(-5.0, +5.0);
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };
        double alpha = 2.0;
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);
        //scaling
        // scale(x, y, alpha);
        // StdDraw.setPenColor(StdDraw.BLUE);
        // StdDraw.polygon(x, y);
        //translating
        // double dx = 2.0, dy = 1.0;
        // translate(x, y, dx, dy);
        // StdDraw.setPenColor(StdDraw.GREEN);
        // StdDraw.polygon(x, y);
        //rotating
        double theta = 45.0;
        scale(x, y, theta);
        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.polygon(x, y);
    }
}
