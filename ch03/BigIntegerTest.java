import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;



public class BigIntegerTest
{
	private static final int NUM  = 60;
	private static final int MAX  = 490;
	
	/**
	 * 计算从490个数值中抽取60个，中奖概率(1*2*...*60)/(490*489*488*...*(490-60+1))
	 */
	private static void test()
	{
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		for(int i = 1;i <= NUM;i++)
		{
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(MAX - i + 1));
			lotteryOdds = lotteryOdds.divide(BigInteger.valueOf(i));
		}
		
		System.out.println("Youe odds are 1 in " + lotteryOdds +". Good luck!!");
	}
	
	/**
	 * for-each循环
	 */
	private static void for_each()
	{
		int[] x = new int[10];
		for(int i : x)
		{
			i = 8;
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(x));
	}
	
	/**
	 *   测试数组拷贝
	 */
	private static void array_copy()
	{
		int[] srcArray = new int[]{1,2,3,4,5,6};
		int[] dstArray = srcArray;
		dstArray[5] = 7;
		System.out.println(Arrays.toString(srcArray));
		
		int[] srcArray2 = new int[]{1,2,3,4,5,6};
		int[] dstArray2 = Arrays.copyOf(srcArray2, srcArray2.length);
		dstArray2[5] = 7;
		System.out.println(Arrays.toString(srcArray2));
	}
	public static void main(String[] args)
	{
		//test();
		//测试for-each
		//for_each();
		//测试数组拷贝
		array_copy();
	}
}
