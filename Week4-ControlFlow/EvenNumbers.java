public class EvenNumbers{
    public static void main(String[] args) {
        //print only even numbers from 1 to n

        int n = Integer.parseInt(args[0]);
        int i = 1;

        while( i <= n) { 
            if(i % 2 == 0)
                System.out.println(i);
            
            i++;
        }
    }
}