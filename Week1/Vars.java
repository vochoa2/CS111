public class Vars{
    public static void main(String[] args) {
        //This is a comment, omg! 
        /*
        */

        // declaring variables

        int x = 3;
        int y = 15;
        int z = 20;

        // play with division
        int divideYbyX = y / x; // one = means assignment
        int divideZbyX = z / x;
        int modulusZbyX = z % x;

        System.out.println("Y / X = " + divideYbyX);
        System.out.println("Z / X = " + divideZbyX);
        System.out.println("Z % X = " + modulusZbyX);

        double divideZbyXreal = (z * 1.0 / x);
        System.out.println("Z / X = " + divideZbyXreal);

        boolean myBool = true;
        boolean notMyBool = !myBool;

        boolean test = (myBool && notMyBool);
        
        System.out.println("Boolean symbol = " + myBool + notMyBool);
        System.out.println(test);

        System.out.println(Math.sqrt(25));

        int xx = 2;
        System.out.println(xx);
        xx = xx + 1;
        System.out.println(xx);
        xx += 1;
        System.out.println(xx);
        System.out.println(++xx); //Note difference to sysout(xx++); where it prints xx before incrementing
        System.out.println(xx);
    }
}