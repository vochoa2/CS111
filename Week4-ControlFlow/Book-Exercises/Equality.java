public class Equality{
    public static void main(String[] args){
        //Takes three integers and prints equal if all three equal

        int a = Integer.parseInt(args[0]);//1 operation
        int b = Integer.parseInt(args[1]);//1 operation
        int c = Integer.parseInt(args[2]);//1 operation

        boolean equal = a == b && b == c; //2 operations in comparison, 1 operation assigning

        if (equal) System.out.println("equal"); //1 operation
        else System.out.println("not equal"); //1 operation

        //if((x > 0 && x < 1) && (y > 0 && y < 1 ));
    }
}