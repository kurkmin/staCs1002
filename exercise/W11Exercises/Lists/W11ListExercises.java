import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class W11ListExercises {

	Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		W11ListExercises arrays = new W11ListExercises();
		arrays.runExercises();
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
		List<Integer> myList = new ArrayList<Integer>();
		System.out.println("Enter number of elements: ");
		int numElements = reader.nextInt();
		for (int i = 0; i < numElements; i++) {
			System.out.println("Enter element: ");
			int element = reader.nextInt();
			myList.add(element);
		}

		System.out.println("Elements: ");
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
	}

	public List<Integer> getList() {
		// create a list and its size based on user input
		List<Integer> myList = new ArrayList<Integer>();
		System.out.println("Enter number of elements: ");
		int numElements = reader.nextInt();
		// adds elements
		for (int i = 0; i < numElements; i++) {
			System.out.println("Enter element: ");
			int element = reader.nextInt();
			myList.add(element);
		}
		return myList;
	}

	public void exercise2() {
		List<Integer> myList = getList();
		System.out.println("Elements: ");
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
	}

	// return the maximum int in the list
	public void exercise3() {
		List<Integer> myList = getList();
		int max = 0;
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) > max) {
				max = myList.get(i);
			}
		}
		System.out.println("the maximum integer in the list is: " + max);
	}

	public void exercise4() {
		List<Integer> myList = getList();
		int total = 0;
		for (int i = 0; i < myList.size(); i++) {
			total += myList.get(i);
		}
		double mean = total / myList.size();
		System.out.println(mean);
	}

	public void exercise5() {
		List<Integer> myList = getList();
		System.out.println("Enter element to search for");
		int userElement = reader.nextInt();
		boolean found = false;
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) == userElement) {
				System.out.println(myList.indexOf(myList.get(i)));
				found = true;
			}
		}

		if (!found) {
			System.out.println("-1");
		}
	}

	public void exercise6() {
		List<Integer> myList = getList();
		System.out.println("Enter element to search for");
		int userElement = reader.nextInt();
		boolean found = false;
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) == userElement) {
				System.out.println(myList.lastIndexOf(myList.get(i)));
			}
		}

		if (found) {
			System.out.println("-1");
			found = true;
		}
	}

	public void exercise7() {
		// user inputs to form a matrix
		List<List<Integer>> userList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			List<Integer> innerList = new ArrayList<>();
			for (int j = 0; j < 3; j++) {
				System.err.printf("Enter element [%d, %d]: ", i + 1, j + 1);
				int userInt = reader.nextInt();
				innerList.add(userInt);
			}
			userList.add(innerList);
		}

		// transpose the matrix
		System.err.println("Transposed array: ");
		List<List<Integer>> transposedList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			transposedList.add(new ArrayList<>());
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int userElement = userList.get(i).get(j);
				transposedList.get(j).add(userElement);
				if (j == 2) {
					System.err.printf("%n");
				}
			}

		}
		// ! print
		System.out.println(transposedList);
	}

}
