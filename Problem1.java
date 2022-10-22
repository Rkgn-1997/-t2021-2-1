import java.util.Scanner;

public class Problem1 {

		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the numbers");

			double a = sc.nextDouble();

			double b = sc.nextDouble();

			System.out.println("Enter the operator (+,-,*,/)");

			String s=sc.next();

			double d = 0;

			switch (s) {

			case "+":

				d = a + b;

				break;

			case "-":

				d = a - b;

				break;

			case "*":

				d = a * b;

				break;

			case "/":

				d = a / b;

				break;

			default:

				System.out.println("You enter wrong input");

				break;
			}

			System.out.println("The final result:");

			System.out.println();

			System.out.println(a + " " + s + " " + b + " = " + d);
							
		}
	}