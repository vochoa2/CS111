public class TestingForTransforms{
    public static void main(String[] args){
    StdDraw.setScale(-5.0, +5.0); 
    double[] x = { 0, 1, 1, 0 }; 
    double[] y = { 0, 0, 2, 1 }; 
    double alpha = 2.0; 
    StdDraw.setPenColor(StdDraw.RED); 
    StdDraw.polygon(x, y); 
    scale(x, y, alpha); 
    StdDraw.setPenColor(StdDraw.BLUE);
    StdDraw.polygon(x, y);
    }
}