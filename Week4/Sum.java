public class Sum{
    public static void main(String[] args){
        //sum 1 + 2 + 3 + ... + n

        // int n = Integer.parseInt(args[0]); //1 op
        // //int currentAddend = 1;
        // int sum = 0; //1 op
        // while (n > 0){ // n ops * 2 ops inside + n ops for comparison = 2n ops + n op + 1 op at the end when false !
        //     sum += n; 
        //     n--;
        // }

        // System.out.println(sum); // 1 op

        //Total ops is 4 + 3n, where n is inputted number

        //As a for loop:
        for(int i = n; i > 0; i--) {
            sum += i;
        }

        System.out.println(sum); // 1 op
    }
    
}