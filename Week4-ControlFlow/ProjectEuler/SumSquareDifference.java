public class SumSquareDifference {
    public static void main(String[] args) {
        int sumOfSquares = 0;
        int squareOfSum = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += i * i;
            squareOfSum += i;
        }

        int sumSquareDifference = (squareOfSum * squareOfSum) - sumOfSquares;
        System.out.println(sumSquareDifference);
    }
    
}
