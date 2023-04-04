package element;
import java.util.*;

public class Max {

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
		int max=arr[0];
		for(int i=0;i<size;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Largest Number in Array is "+max);

	}

}
