package practice.salary;

public class SalesReceipt
{
	private String date;
	private int amount;
	private int employeeId;

	public SalesReceipt(String date, int amount, int employeeId)
	{
		this.date = date;
		this.amount = amount;
		this.employeeId = employeeId;
	}

	public String getDate()
	{
		return this.date;
	}

	public int getAmount()
	{
		return this.amount;
	}

}
