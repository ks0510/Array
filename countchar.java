package charr;
import java.util.*;

public class Countchar {

	public static void main(String[] args) {
		// creating sc object with Scanner package
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		// Using .tocharArray() function to conver string into character array		
		char [] ch = str.toCharArray();
		
		int count=0;
		
		// Used for to add characters in array ch with string str1 for counting the numbers of characters
		
		for(int i=0;i<ch.length;i++) {
			String str1="";
			while(i<ch.length && ch[i] != ' ') {
				str1= str1 + ch[i];
				i++;
			}
			if(str1.length()>0) {
				System.out.println(str1+"->" + str1.length());
				count++;
			}
		}
		System.out.println("Number of words "+count);
		

	}
}
