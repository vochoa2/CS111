/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author:
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {
        return Math.sqrt(3) * length / 2;
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {

        double[] xPoints = new double[3];
        double[] yPoints = new double[3];

        xPoints[0] = x;
        xPoints[1] = x + 0.5*length;
        xPoints[2] = x - 0.5*length;

        yPoints[0] = y;
        yPoints[1] = yPoints[2]  = y + height(length);

        StdDraw.filledPolygon(xPoints, yPoints);

    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {

	    if(n == 0) return;

        filledTriangle(x, y, length);

        double x0 = x - 0.5*length;
        double x1 = x + 0.5*length;

        double y0 = y + height(length);

        sierpinski(n - 1, x0, y, length/2);
        sierpinski(n - 1, x1, y, length/2);
        sierpinski(n - 1, x, y0, length/2);

    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double length = 1;

        StdDraw.line(0, 0, 1, 0);
        StdDraw.line(1, 0, 0.5, height(1));
        StdDraw.line(0.5, height(1), 0, 0);

        sierpinski(n, 0.5, 0, length/2);
    }
}
