package element;

import java.util.Scanner;

public class Even {

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
			int max=arr[0];
			for(int i=0;i<size;i++) {
				if(i%2==0) {
					System.out.println("Elements at even index "+arr[i]);
				}
			}
			


	}

}
