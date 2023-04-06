package element;

import java.util.Scanner;

public class Sumelement {

	public static void main(String[] args) {
	
		// creating sc object with scanner class
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Array");
		int size = sc.nextInt();

		int[] arr = new int[size];
		int sum = 0;

		// for loop for taking user input of array element

		System.out.println("Enter elements");
		for (int i = 0; i < size; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}

		// for to access each element in array for summation

		for (int i = 0; i < size; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of element " + sum);

	}

}
