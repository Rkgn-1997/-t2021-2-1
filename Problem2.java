import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		for(int i=1; i<=2*a; i++)
		{
			if(i%2==1)
			{
				System.out.print(i + " ");
			}
			
		}
	}

}
