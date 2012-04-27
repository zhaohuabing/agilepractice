package practice.salary;

import java.util.Date;
import java.util.GregorianCalendar;

public class BiWeeklySchedule implements PaymentSchedule
{
	private static final int DAYS_OF_WEEK = 7;
	
	//@TODO
	public boolean isPayDate(Date date)
	{
		GregorianCalendar payDay = new GregorianCalendar();
		payDay.setTime(date);
		if(payDay.get(GregorianCalendar.DAY_OF_WEEK)==GregorianCalendar.SATURDAY)
		{
			int dayOfMonth=payDay.get(GregorianCalendar.DAY_OF_MONTH);
			if(dayOfMonth<=DAYS_OF_WEEK)
			{
				return false;
			}
			if(dayOfMonth<DAYS_OF_WEEK)
			{
				return false;
			}
		}
		return false;
	}

	//@TODO
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
				payDay.get(GregorianCalendar.DAY_OF_MONTH) - DAYS_OF_WEEK*2);
		return payPeriondStartDay.getTime();
	}
}
