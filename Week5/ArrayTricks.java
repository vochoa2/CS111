public class ArrayTricks {
    public static void main(String[] args) {

        //initializing array based on n
        int n = Integer.parseInt(args[0]);

        int moreArray[]; //declare
        moreArray = new int[n];
        for (int i = 0; i < n; i++) {
            moreArray[i] = (i+2);
        }

        /*
        //Reverse Array
        //by swapping values on ends
        //Work from end to halfway point, swap left of center
        // with right of center :o
        for (int i = 0; i < moreArray.length/2; i++) {
            int temp = moreArray[i];
            moreArray[i] = moreArray[moreArray.length - 1 - i];
            moreArray[moreArray.length - 1 - i] = temp;
        }
        */

        /*
        //Finding max and min values
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0, minIndex = 0;

        int a[] = new int[90];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (90*Math.random());
        }

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > max) {max = a[i]; maxIndex = i; }
            if(a[i] < min) {min = a[i]; minIndex = i; }
        }

        System.out.println(min + " , "  + max);
        */

        //for eaceh loop
        for(int i : moreArray){
            System.out.println(i + " "  + moreArray[i - 1]);
        }
        
    }
}
