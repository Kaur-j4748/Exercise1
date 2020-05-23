/**
 * Software Engineering - Summer 2020
 */
package myJavaProject;
import java.util.Scanner;

public class myProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Integer Number to check it is Even or Odd: ");
		// input
		int num = input.nextInt();
		
		//result
		System.out.println("Answer : ");
		evenOdd(num);
		
		/*
		 * *Git now is branch b1
		 * from now on until switching out of branch b1
		 * any changed occur here will be tracked in branch b1
		 * and will not be reflected in any other branch unless b1 is 
		 * merged later with that branch
		 */

	}
	
	//Method to find out even or odd number
	static void evenOdd(int num) {

		
		if(num % 2 == 0) {
			System.out.print(num + " is an even number");
	
	}
	else 
		System.out.print(num + " is an odd number");

	

}
}
