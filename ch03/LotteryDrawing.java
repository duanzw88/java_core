import java.text.NumberFormat;
import java.util.*;



public class LotteryDrawing
{
	//private static final int MAX = 490;
	private static final int NUM = 6;
	private static int max = 490;
	public static void main(String[] args)
	{
		inverst_grow();
	}
	
	/**
	 * 不同利率下得投资增长
	 */
	private static void inverst_grow()
	{
		int year = 10;
		int nrate = 6;
		int base_rate = 10;
		double[][] balance = new double[year][nrate];
		double[] grow_rate = new double[nrate];
		System.out.println("-----------------------------------------------------------------------");
		
		//工厂方法
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		
		//初始化利率
		for(int i = 0;i < nrate;i++)
		{
			grow_rate[i] = (base_rate + i) / 100.0;
			System.out.printf("%10s", percentFormat.format(grow_rate[i]));
			//System.out.println(percentFormat.format(grow_rate[i]));
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		
		//System.out.println(Arrays.toString(grow_rate));
		for(int j = 0;j < nrate;j++)
		{
			balance[0][j] = 10000.00;
		}
		for(int i = 1;i < year;i++)
		{
			for(int j = 0;j < nrate;j++)
			{
				balance[i][j] = balance[i - 1][j] * (grow_rate[j] + 1.0);
			}
		}
		
		for(double[] row : balance )
		{
			for(double b : row)
			{
				System.out.printf("%10.2f",b);
			}
			System.out.println();
		}
		//System.out.println(Arrays.toString(balance[0]));
		//for(int i = )
		
		System.out.println("-----------------------------------------------------------------------");
	}
}