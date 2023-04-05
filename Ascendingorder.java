package element;
import java.util.Arrays;
import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) {
			int num=sc.nextInt();
			arr[i]=num;
		}
		Arrays.sort(arr);
		for(int i=0;i<size;i++) {
			System.out.println("Elements of Array in Ascending order "+arr[i]);
		}

	}

}
