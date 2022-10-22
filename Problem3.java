import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=sc.nextInt();
		
		
		if(a==1)
		{
			System.out.print(a);
		}
		else if(a==2)
		{
			a=a-1;
			System.out.print(a);
		}
		
		else if(a%2!=0)
		{
			a=a+2;
			for(int j=1;j<=a;j++)
			{
				if(j%2!=0)
				{
					System.out.print(j+" ");
				}
			}
		}
			
				
				else if (a%2==0)
				{
					a=a+2;
					for(int j=1;j<=a;j++)
					{
						if(j%2!=0)
						{
							System.out.print(j+" ");
						
					}
				}
			}
		}
	}
