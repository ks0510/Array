package element;

import java.util.Scanner;

public class Reverse {

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
		for(int i=size-1;i>=0;i--) {
			System.out.println("Elements of Array in reverse order "+arr[i]);
			
		}
    }
}
