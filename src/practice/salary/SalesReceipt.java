package practice.salary;

import java.util.Date;

public class SalesReceipt
{
	private Date date;
	private int amount;
	private int employeeId;

	public SalesReceipt(Date date, int amount, int employeeId)
	{
		this.date = date;
		this.amount = amount;
		this.employeeId = employeeId;
	}

	public Date getDate()
	{
		return this.date;
	}

	public int getAmount()
	{
		return this.amount;
	}

}
