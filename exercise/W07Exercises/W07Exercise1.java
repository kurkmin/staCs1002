import java.util.Scanner;

public class W07Exercise1 {

	Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		W07Exercise1 exercises = new W07Exercise1();
		exercises.runExercises();
	}

	public void runExercises() {

		System.out.println("Enter exercise number:");
		int number = reader.nextInt();

		switch (number) {

			case (1):
				exercise1();
				break;
			case (2):
				exercise2();
				break;
			case (3):
				exercise3();
				break;
			case (4):
				exercise4();
				break;
			case (5):
				exercise5();
				break;
			case (6):
				exercise6();
				break;
			case (7):
				exercise7();
				break;
			default:
				System.out.println("unknown exercise");
		}
	}

	public void exercise1() {

		System.out.println("Enter number of elements:");
		int userInput = reader.nextInt();
		int[] userArray = new int[userInput];
		for (int i = 0; i < userInput; i++) {
			System.out.println("Enter element:");
			int userElement = reader.nextInt();
			userArray[i] = userElement;
		}
		System.out.println("Elements:");
		for (int i = 0; i < userArray.length; i++) {
			System.out.println(userArray[i]);
		}
	}

	public int[] getArray() {
		System.out.println("Enter number of elements:");
		int userInput = reader.nextInt();
		int[] userArray = new int[userInput];
		return userArray;
	}

	public void exercise2() {
		int[] userArray = getArray();
		for (int i = 0; i < userArray.length; i++) {
			System.out.println("Enter element:");
			int userElement = reader.nextInt();
			userArray[i] = userElement;
		}
		System.out.println("Elements:");
		for (int i = 0; i < userArray.length; i++) {
			System.out.println(userArray[i]);
		}

	}

	public void exercise3() {
		int[] userArray = getArray();
		for (int i = 0; i < userArray.length; i++) {
			System.out.println("Enter element:");
			int userElement = reader.nextInt();
			userArray[i] = userElement;
		}
		int userMaxInt = 0;
		for (int i = 0; i < userArray.length; i++) {
			if (userArray[i] > userMaxInt) {
				userMaxInt = userArray[i];
			}
		}

		System.out.println("The maxium value in the array is: " + userMaxInt);
	}

	public void exercise4() {
		int[] userArray = getArray();
		for (int i = 0; i < userArray.length; i++) {
			System.out.println("Enter element:");
			int userElement = reader.nextInt();
			userArray[i] = userElement;
		}
		int userTotal = 0;
		for (int i = 0; i < userArray.length; i++) {
			userTotal = userTotal + userArray[i];
		}
		double userMean = userTotal / userArray.length;
		System.out.println("the mean of your array is: " + userMean);

	}

	public void exercise5() {
		int[] userArray = getArray();
		for (int i = 0; i < userArray.length; i++) {
			System.out.println("Enter element:");
			int userElement = reader.nextInt();
			userArray[i] = userElement;
		}
		System.out.println("Type the integer you are looking for: ");
		int userSearch = reader.nextInt();
		boolean found = false;
		for (int i = 0; i < userArray.length; i++) {
			if (userArray[i] == userSearch) {
				System.out.println(i);
				found = true;
				break;
			}

		}
		if (!found) {
			System.out.println(-1);
		}

	}

	public void exercise6() {
		int[] userArray = getArray();
		for (int i = 0; i < userArray.length; i++) {
			System.out.println("Enter element:");
			int userElement = reader.nextInt();
			userArray[i] = userElement;
		}
		boolean found = false;
		System.out.println("Type the integer you are looking for: ");
		int userSearch = reader.nextInt();
		for (int i = userArray.length - 1; i >= 0; i--) {
			if (userArray[i] == userSearch) {
				System.out.println(i);
				found = true;
				break;
			}
		}
		// if not found (true) then display -1
		if (!found) {
			System.out.println(-1);
		}
	}

	public void exercise7() {
		// user inputs to form a matrix
		int[][] userArray = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.err.printf("Enter element [%d, %d]: ", i + 1, j + 1);
				int userInt = reader.nextInt();
				userArray[i][j] = userInt;
			}
		}
		// transpose the matrix
		System.err.println("Transposed array: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				userArray[i][j] = userArray[j][i];
				System.err.printf("%d ", userArray[i][j]);
				if (j == 2) {
					System.err.printf("%n");
				}
			}
		}

	}
}
