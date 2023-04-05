package element;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter size of Array");
			int size=sc.nextInt();
			
			int[] arr=new int[size];
			
			System.out.println("Enter elements");
			for(int i=0;i<size;i++) {
				int num=sc.nextInt();
				arr[i]=num;
			}
			int min=arr[0];
			for(int i=0;i<size;i++) {
				if(arr[i]<min) {
					min=arr[i];
				}
			}
			System.out.println("Smallest Number in Array is "+min);


	}

}
