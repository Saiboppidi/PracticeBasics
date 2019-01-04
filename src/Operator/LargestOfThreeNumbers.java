package Operator;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1= scan.nextInt();
		System.out.println("enter second number:");
		int num2 =scan.nextInt();
		System.out.println("enter Third number:");
		int num3 =scan.nextInt();
		scan.close();
		int temp=num1>num2? num1:num2;
		int result=num3>temp?num3:temp;
		System.out.println("Largest number is:"+result);



	}

}
