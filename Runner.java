package Scanner;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter the First number, second number and the action");
	int a =scan.nextInt();
	int b =scan.nextInt();
	scan.nextLine();
	String Action =scan.nextLine();
	
	
	
	if (Action.equals("+")){
		System.out.println(a + "+" + b + "=" + (a+b));
	}
	else if (Action.equals("-")){
		System.out.println(a + "-" + b + "=" + (a-b));		
	}
	else if (Action.equals("/")){
		System.out.println(a + "/" + b + "=" + (a/b));	
		}
	else if (Action.equals("*")){
		System.out.println(a + "*" + b + "=" + (a*b));
	}
	else {
		System.out.println("Enter valid input");
	}
		{
			scan.close();
	}
	
//	
//	}
//	
//	public void addition(int a, int b) {
//		System.out.println(a + "+" + b + "=" + (a+b));
//	}
//	
//	 
//	public void substraction(int a, int b) {
//		System.out.println(a + "-" + b + "=" + (a-b));
//	}
//	
//	public void division(int a, int b) {
//		System.out.println(a + "/" + b + "=" + (a/b));
//	}
//	
//	public void multiplication (int a, int b) {
//		System.out.println(a + "*" + b + "=" + (a*b));
	}


//	Create a project that has four methods; 
//	addition, subtraction, multiplication, and division.
//	All of these methods should take two numbers as parameters.
//	Create a method to ask the user which of the four methods
//	they wish to use, then take the numbers as user input for the
//	operation and output the result back to the user.
	
	
	
	

//	{
//	Scanner scan = new Scanner(System.in);
//    System.out.println("Enter your username");
//    
//    String user = scan.nextLine();
//	}
}
