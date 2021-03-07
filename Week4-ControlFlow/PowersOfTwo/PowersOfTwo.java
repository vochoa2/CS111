public class PowersOfTwo {
    public static void main(String[] args) {
        //Print powers of 2 less than or equal to n
        int n = Integer.parseInt(args[0]);
        int i = 0;
        int powerOf2 = 0;
        while( i <= n){
            if(i == 0)
                powerOf2 = 1;
            

            System.out.println(powerOf2);
            powerOf2 = 2 * powerOf2;
            i++;
        }
    }
    
}
