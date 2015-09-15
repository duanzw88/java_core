import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;



public class CalendarTest
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		//构造日历对象
		GregorianCalendar gCalendar = new GregorianCalendar();
		//获取当前日期和时间
		int today = gCalendar.get(Calendar.DAY_OF_MONTH);
		int month = gCalendar.get(Calendar.MONTH);
		
		//设置这个月的第一天 并取得这一天为星期几
		gCalendar.set(Calendar.DAY_OF_MONTH,1);
		int weekday = gCalendar.get(Calendar.DAY_OF_WEEK);
		
		int indent = 0;
		while(weekday != gCalendar.getFirstDayOfWeek())
		{
			indent++;
			//System.out.print("\t");
			gCalendar.add(Calendar.DAY_OF_MONTH,-1);
			weekday = gCalendar.get(Calendar.DAY_OF_WEEK);
			//System.out.println("weekday = " + weekday);
		}
		
		String[] weekDayNames = new DateFormatSymbols().getShortWeekdays();
		
		for(String str :  weekDayNames)
		{
			System.out.printf("%s\t",str);
			gCalendar.add(Calendar.DAY_OF_MONTH,1);
		}

		System.out.println();
		System.out.printf("\t");
		
		for(int i = 0;i < indent;i++)
		{
			System.out.print("\t");
		}
	
		gCalendar.set(Calendar.DAY_OF_MONTH,1);
		do
		{
			int day = gCalendar.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%d",day);
			
			if(day == today)
			{
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			System.out.printf("\t");
			gCalendar.add(Calendar.DAY_OF_WEEK,1);
			weekday = gCalendar.get(Calendar.DAY_OF_WEEK);
			if(weekday == gCalendar.getFirstDayOfWeek())
			{
				System.out.println();
				System.out.printf("\t");
			}
		} while (gCalendar.get(Calendar.MONTH) == month);
//		if(weekday != firstDayOfWeek)
//		{
			System.out.println();
//		}
 
 
	}
}