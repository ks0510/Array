import java.util.*;

public class Main
{
    public static void  present6(int [] arr){
        if(arr.length>0){
            if(arr[0]==6 || arr[arr.length-1]==6){
               System.out.println("True");
            }
            else{
              System.out.println("False");
            } 
        }
        else{
            System.out.println("Array is empty");
            
        } 
        
    }
    
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
		present6(arr);
	}
}
