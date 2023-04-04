package element;
import java.util.*;

public class Array {

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
		
		for(int i=0;i<size;i++) {
			System.out.println("Element of Array at "+i+" index is "+arr[i]);
		}
		
		sc.close();
	}


}
