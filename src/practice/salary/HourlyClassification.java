package practice.salary;

import java.util.HashMap;
import java.util.Iterator;

public class HourlyClassification implements PaymentClassification
{
	private double rate;
	private HashMap<String, TimeCard> timeCards = new HashMap<String, TimeCard>();

	public HourlyClassification(double rate)
	{
		super();
		this.rate = rate;
	}

	public TimeCard getTimeCard(String date)
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
		Iterator<TimeCard> it =timeCards.values().iterator();
		while(it.hasNext())
		{
			pay+=it.next().getHour()*rate;
		}
		return pay;
	}

}
