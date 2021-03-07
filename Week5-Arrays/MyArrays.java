public class MyArrays {
    public static void main(String[] args) {
        
        // double[] myNumbers = {2, 3, 3.14, 6.22, 6.37};
        // System.out.println(myNumbers[2]);

        // int n = Integer.parseInt(args[0]);

        // int[] myArray;
        // myArray = new int[n];

        // for(int i = 0; i < n; i++){
        //     myArray[i] = (i + 1);
        // }

        // System.out.println(myArray[n-2]);
        // System.out.println(myArray.length);

        int[] anArray = new int[15];
        Arrays.fill(anArray, 5);
        //All 5's in the array

        double[] a = new double[60];
        double[] b = new double[60];
        for(int i = 0; i < b.length; i++){
            b[i] = a[i];
        }
    }
}
