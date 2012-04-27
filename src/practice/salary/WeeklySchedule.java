package practice.salary;

import java.util.Date;
import java.util.GregorianCalendar;

public class WeeklySchedule implements PaymentSchedule
{
	private static final int DAYS_OF_WEEK = 5;

	@Override
	public boolean isPayDate(Date date)
	{
		GregorianCalendar payDay = new GregorianCalendar();
		payDay.setTime(date);
		return payDay.get(GregorianCalendar.DAY_OF_WEEK) == GregorianCalendar.SATURDAY;
	}

	@Override
	public Date getgetPayPeriodStartDate(Date date)
	{
		GregorianCalendar payDay = new GregorianCalendar();
		payDay.setTime(date);

		GregorianCalendar payPeriondStartDay = new GregorianCalendar();
		payPeriondStartDay.set(GregorianCalendar.YEAR,
				payDay.get(GregorianCalendar.YEAR));
		payPeriondStartDay.set(GregorianCalendar.MONTH,
				payDay.get(GregorianCalendar.MONTH));
		payPeriondStartDay.set(GregorianCalendar.DAY_OF_MONTH,
				payDay.get(GregorianCalendar.DAY_OF_MONTH) - DAYS_OF_WEEK);
		payPeriondStartDay.set(GregorianCalendar.AM_PM,GregorianCalendar.AM);
		payPeriondStartDay.set(GregorianCalendar.HOUR,0);
		payPeriondStartDay.set(GregorianCalendar.MINUTE,0);
		payPeriondStartDay.set(GregorianCalendar.SECOND,0);
		payPeriondStartDay.set(GregorianCalendar.MILLISECOND,0);
		return payPeriondStartDay.getTime();
	}

}
