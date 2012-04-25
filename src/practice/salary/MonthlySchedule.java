package practice.salary;

import java.util.Date;
import java.util.GregorianCalendar;

public class MonthlySchedule implements PaymentSchedule
{

	@Override
	public boolean isPayDate(Date date)
	{
		GregorianCalendar day = new GregorianCalendar();
		day.setTime(date);
		GregorianCalendar nextDay = new GregorianCalendar();
		nextDay.setTimeInMillis(date.getTime() + 24 * 60 * 60 * 1000);
		return day.get(GregorianCalendar.MONTH) != nextDay
				.get(GregorianCalendar.MONTH);
	}

}
