package practice.salary;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;

public class HourlyClassification implements PaymentClassification
{
	private double rate;
	private HashMap<Date, TimeCard> timeCards = new HashMap<Date, TimeCard>();

	public HourlyClassification(double rate)
	{
		super();
		this.rate = rate;
	}

	public TimeCard getTimeCard(Date date)
	{
		return timeCards.get(date);
	}

	public void addTimeCard(TimeCard timeCard)
	{
		timeCards.put(timeCard.getDate(), timeCard);

	}

	@Override
	public double calculatePay(PayCheck pc)
	{
		double pay = 0;
		Iterator<TimeCard> it = timeCards.values().iterator();
		while (it.hasNext())
		{
			TimeCard tc = it.next();
			Date tcDate = tc.getDate();

			GregorianCalendar theDayAfterPayDay = new GregorianCalendar();
			theDayAfterPayDay.setTime(pc.getPayDate());
			theDayAfterPayDay.set(GregorianCalendar.DAY_OF_MONTH,
					theDayAfterPayDay.get(GregorianCalendar.DAY_OF_MONTH) + 1);

			if (tcDate.after(pc.getPayPeriodStartDate())
					&& tcDate.before(theDayAfterPayDay.getTime()))
			{
				pay += tc.getHour() * rate;
			}
		}
		return pay;
	}
}
