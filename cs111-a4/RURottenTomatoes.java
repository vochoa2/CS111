/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		// WRITE YOUR CODE HERE
		int rows = Integer.parseInt(args[0]);
		int columns = Integer.parseInt(args[1]);

		int[][] MovieRatingsMatrix = new int[rows][columns];
		int argsRatingIndex = 2;

		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				MovieRatingsMatrix[i][j] = Integer.parseInt(args[argsRatingIndex]);
				argsRatingIndex++;
			}
		}

		int highestMovieRatingsIndex = 0;
		int highestMovieRatingsSum = Integer.MIN_VALUE;
		int movieRatingsSum = 0;

		for(int i = 0; i < columns; i++){
			for(int j = 0; j < rows; j++){
				movieRatingsSum += MovieRatingsMatrix[j][i];
			}
			if(movieRatingsSum > highestMovieRatingsSum){
				highestMovieRatingsSum = movieRatingsSum;
				highestMovieRatingsIndex = i;
			}
			movieRatingsSum = 0;
		}

		System.out.println(highestMovieRatingsIndex);


	}
}
