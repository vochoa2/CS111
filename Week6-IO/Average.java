public class Average {
    public static void main(String[] args) {
        double sum = 0.0;
        int n = 0;
        
        //While the input stream is not empty 
        //EOF character is end of your input (ctrl d), which will be where the 
        // stream empties after reading all the values in it in.
        while(!StdIn.isEmpty()){
            double x = StdIn.readDouble();
            sum += x;
            n++;
        }

        StdOut.print(sum / n);
    }
    
}
