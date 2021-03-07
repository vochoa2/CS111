
/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author:
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {

		
		//basic first attempt
		int n = args.length;
		boolean duplicate = false;
		//WRITE YOUR CODE HERE
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				int a = Integer.parseInt(args[i]);
				int b = Integer.parseInt(args[j]);
				if(a == b && i != j){
					duplicate = true;
					break;
					//issue is this will go all through it again
				}
			}
		}

		System.out.println(duplicate);
		

		//can't do slide method with Arrays.sort as that uses import 
	}
}
