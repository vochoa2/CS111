public class ReverseInPlace{
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(args[i]);
        }

        //reverse array

        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }


    }
}