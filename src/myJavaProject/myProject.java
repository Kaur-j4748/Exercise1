/**
 * Software Engineering - Summer 2020
 */
package myJavaProject;
import java.util.Scanner;

public class myProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Enter an Integer Number: ");
		// input
		num = input.nextInt();
		
		//result
		System.out.print("Answer :");
		evenOdd(num);
		System.out.println();
		

	}
	
	//Method to find out even or odd number
	public static int evenOdd(int num) {
		String n = "";
		
		if(num % 2 == 0) {
			n = num + "is an even number";
		
	}
	else {
		n = num + "is an odd number";
	}
	
	return num;

}
}
