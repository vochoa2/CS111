public class Cake {
    //Price based on cake size
    //Learning Objectives 4.1a - 4.1b

    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]); //1 operation
        int price = 0; //1 operation

        if(size <= 0) // 1 operation
            System.out.println("That is not a real cake size!"); //1 operation
        else if(size <= 5) //1 operation
            price = 10; //1 operation
        else if (size <= 12) //1 operation
            price = 15; //1 operation
        else
            price = 20; //1 operation

        System.out.println("That is " + price); //1 operation

        //The segments will execute based on the size of the cake
        // max operations: 7 operations; min is 5 ops
    }
}
