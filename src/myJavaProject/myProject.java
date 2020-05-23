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
