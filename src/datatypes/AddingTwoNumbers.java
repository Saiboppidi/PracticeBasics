package datatypes;

import java.util.Scanner;

public class AddingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
System.out.println("Enter first number:");
int num1= scan.nextInt();
System.out.println("enter second number:");
int num2 =scan.nextInt();
scan.close();
int sum=num1+num2;
System.out.println("sum:"+sum);




	}

}
