package Week3Day3;

import java.util.Scanner;

public class codeChallengeDiagonal {

	public static void main(String[] args) {

		Scanner input1 = new Scanner(System.in);
		System.out.println("Please enter the size of your diagonal:");
		int column = 1;
		int row = 1;
		// double columnSum = 0;
		double columnSum1 = 0;
		// double rowSum = 0;
		double rowSum1 = 0;
		int userInput = input1.nextInt();

		int[][] diagonalSize = new int[userInput][userInput];

		System.out.println("Great! You're diagonal will be " + userInput
				+ " x " + userInput + ".");
		System.out.println();
		for (int i = 0; i < userInput; i++) {
			for (int j = 0; j < userInput; j++) {

				System.out.println("Could you please enter any number "
						+ "of your choice for the array placement?");
				diagonalSize[i][j] = input1.nextInt();
			}
		}

		for (column = 0; column < diagonalSize.length; column++) {

			// columnSum = +diagonalSize[column][column];
			columnSum1 = columnSum1 + diagonalSize[column][column];

		}
		for (row = 0; row < diagonalSize.length; row++) {
			// rowSum = +diagonalSize[diagonalSize.length - 1 -
			// row][diagonalSize.length - 1 - row];
			rowSum1 = rowSum1 + diagonalSize[row][row];
			;

		}
		// double sum = columnSum + rowSum;
		double totalSum = (rowSum1 + columnSum1) / 2;

		// System.out.println(sum); WRONG
		// System.out.println(totalSum); CORRECT diagonal sum
		// System.out.println(userInput * userInput);
		System.out
				.println("This is the average of a series of diagonal numbers: "
						+ totalSum / (userInput * userInput));

	}
}
