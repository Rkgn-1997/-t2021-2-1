public class Problem4 {
	public static void main(String[] args) {
		int arr[]= {1,2,8,9,12,46,76,82,15,20,30};
		System.out.print("{");
		for(int i=1;i<=9;i++)
		{
			int count=0;
			System.out.print(i+":");
			for(int j=0;j<11;j++)
			{
				if(arr[j]%i==0)
					count++;
			}
			System.out.print(count);
			if(i<9)
				System.out.print(",");
			
		}
		System.out.println("}");
		
	}

}
