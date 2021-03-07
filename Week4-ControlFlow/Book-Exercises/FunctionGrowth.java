public class FunctionGrowth {
    public static void main(String[] args){
        //Prints table of values log n, n, n ln n, n^2, n^3, 2^n for n = 16, 32, 64, ..., 2048

        int INITIAL_N = 16;
        int FINAL_N = 2048;

        for(int i = INITIAL_N; i <= FINAL_N; i *= 2){
            System.out.println((int)Math.log10(i) + "\t" + i + "\t" + i * (int)Math.log(i) * i + 
                                "\t" + (int)Math.pow(i,2) + "\t" + (int)Math.pow(i, 3) + "\t" + (int)Math.pow(2, i));
        }
    }
    
}
