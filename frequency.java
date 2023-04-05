package element;
import java.lang.*;
import java.util.*;

public class Frequency {
	 public static void  checkFreq(int [] arr, int n) {
		 Arrays.sort(arr);
		 
		 for(int i=0;i<n;i++) {
			 int count=1;
			 
			 while(i<n-1 && arr[i]==arr[i+1]) {
				 i++;
				 count++;
			 }
			 System.out.println(arr[i]+ ": "+ count);
			 
			 count++;
		 }
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub33
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) {
			int num=sc.nextInt();
			arr[i]=num;
		}
		sc.close();
		checkFreq(arr,size);
	   

	}

}
