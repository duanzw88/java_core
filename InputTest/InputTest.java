import java.util.Date;
import java.util.Scanner;



public class InputTest
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//get first input
		System.out.println("What is your name:");
		String name = in.nextLine();
		
		System.out.println("How old are you");
		int age = in.nextInt();
		
		System.out.println("Date:"+new Date());
		System.out.println("name = " + name + ". next year,you'll be:" + (age + 1));
	}
}