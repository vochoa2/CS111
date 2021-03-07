public class BinaryToString {
    public static void main(String[] args) {
        //From integer n to String s in binary

        int n = Integer.parseInt(args[0]);
        String s = "";
        
        for(int i = n; i > 0; i /= 2){
            s = (i % 2) + s; //1 if odd, 0 if odd
            // i/=2 reduces to next 
        }

        System.out.println(s);
    }
    
}
