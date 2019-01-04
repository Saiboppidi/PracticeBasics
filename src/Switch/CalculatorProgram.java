package Switch;

import java.util.Scanner;

public class CalculatorProgram {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter first number:");
		int num1= scan.nextInt();
		System.out.println("enter second number:");
		int num2 =scan.nextInt();
		System.out.println("Enter an operator(+,-,*,/):");
		char operator=scan.next().charAt(0);
		
		scan.close();
		int output;
		
		switch (operator)
		{

		case '+':
		output= num1+num2;
		break;
		case '-':
			output= num1-num2;
			break;
		case '*':
			output= num1*num2;
			break;
		case '/':
			output= num1/num2;
			break;
		default:
			System.out.println("you have entered wrong operator");
		return;
		}
		System.out.println(num1+""+operator+""+num2+":"+output);
	}
}
