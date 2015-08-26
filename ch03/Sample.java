import java.util.Scanner;



public class Sample
{
	public static void main(String[] args)
	{
		int count = 0;
		int n;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		for(count = 1; count <= 10;count++)
		{
			System.out.println("count = " + count + "   sum = " + sum);
			n = in.nextInt();
			if(n < 0)
			{
				continue;
			}
			sum += n;
		}
		
		
	}
}