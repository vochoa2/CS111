public class MoreArrays {
    public static void main(String[] args) {
        
        // double moreNumbers[] = {2, 1, 3.4, 5.6, 7.7};
        // System.out.println(moreNumbers[4]);
        int n = Integer.parseInt(args[0]);

        int moreArray[]; //declare
        moreArray = new int[n];
        for (int i = 0; i < n; i++) {
            moreArray[i] = (i+1);
        }

        // for (int i = 0; i < n; i++) {
        //     System.out.println(i + " " + moreArray[i]);
        // }

        //Print array in reverse
        //Start at n - 1, because index of less item is one less 
        // than length, since indexing starts at 0
        // for (int i = n - 1; i >= 0; i--) {
        //     System.out.println(i + " " + moreArray[i]);
   

    }
    
}
