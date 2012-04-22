package practice.salary;

import java.util.HashMap;
import java.util.Map;

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

}
