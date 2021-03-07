public class RandomInt{
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double r = Math.random();

        int t = (int)(r * N);
        //Think of it as a percentage of N this means t will range
        // from 0 to N! (int) gets rid of the numbers after the decimal.
        
        System.out.println(t);
    }
}