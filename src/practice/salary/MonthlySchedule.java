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

	@Override
	public Date getgetPayPeriodStartDate(Date date)
	{
		GregorianCalendar payDay = new GregorianCalendar();
		payDay.setTime(date);
		
		GregorianCalendar payPeriondStartDay = new GregorianCalendar();
		payPeriondStartDay.set(GregorianCalendar.YEAR, payDay.get(GregorianCalendar.YEAR));
		payPeriondStartDay.set(GregorianCalendar.MONTH, payDay.get(GregorianCalendar.MONTH));
		payPeriondStartDay.set(GregorianCalendar.DAY_OF_MONTH, 1);
		payPeriondStartDay.set(GregorianCalendar.AM_PM,GregorianCalendar.AM);
		payPeriondStartDay.set(GregorianCalendar.HOUR,0);
		payPeriondStartDay.set(GregorianCalendar.MINUTE,0);
		payPeriondStartDay.set(GregorianCalendar.SECOND,0);
		payPeriondStartDay.set(GregorianCalendar.MILLISECOND,0);
		return payPeriondStartDay.getTime();
	}

}
