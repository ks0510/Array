package element;

import java.util.Scanner;

public class Secondmax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Array");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter elements");
		for (int i = 0; i < size; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}

		int temp;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
            }
		}
		System.out.println("Second Largest element " + arr[size - 2]);

	}

}
