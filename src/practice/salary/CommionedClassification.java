package practice.salary;

import java.util.HashMap;

public class CommionedClassification implements PaymentClassification
{

	private double rate;

	private HashMap<String, SalesReceipt> salesRecipts = new HashMap<String, SalesReceipt>();

	public CommionedClassification(double rate)
	{
		super();
		this.rate = rate;
	}

	public void addSalesReceipt(SalesReceipt salesReceipt)
	{
		salesRecipts.put(salesReceipt.getDate(), salesReceipt);
	}

	public SalesReceipt getSalesReceipt(String date)
	{
		return salesRecipts.get(date);
	}

}
