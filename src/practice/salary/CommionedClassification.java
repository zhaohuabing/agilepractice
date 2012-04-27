package practice.salary;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class CommionedClassification implements PaymentClassification
{

	private double rate;
	private double salary;

	private HashMap<Date, SalesReceipt> salesRecipts = new HashMap<Date, SalesReceipt>();

	public CommionedClassification(double rate, double salary)
	{
		super();
		this.rate = rate;
		this.salary = salary;
	}

	public void addSalesReceipt(SalesReceipt salesReceipt)
	{
		salesRecipts.put(salesReceipt.getDate(), salesReceipt);
	}

	public SalesReceipt getSalesReceipt(Date date)
	{
		return salesRecipts.get(date);
	}

	public double calculatePay(PayCheck pc)
	{
		double pay = 0;
		Iterator<SalesReceipt> it = salesRecipts.values().iterator();
		while (it.hasNext())
		{
			SalesReceipt sr = it.next();
			Date srDate = sr.getDate();
			if (srDate.after(pc.getPayPeriodStartDate())
					&& srDate.before(pc.getPayDate()))
			{
				pay += it.next().getAmount() * rate;
			}
		}
		pay += salary;
		return pay;
	}
}
