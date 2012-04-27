package practice.salary;

import java.util.Date;

public class SalesReceiptTransaction implements Transaction
{
	private Date date;
	private int amount;
	private int employeeId;

	public SalesReceiptTransaction(Date date, int amount, int employeeId)
	{
		this.date = date;
		this.amount = amount;
		this.employeeId = employeeId;
	}

	public void execute()
	{
		Employee e = PayrollDatabase.getInstance().getEmployee(employeeId);
		CommionedClassification cf = (CommionedClassification) e
				.getPaymentClassification();
		cf.addSalesReceipt(new SalesReceipt(date, amount, employeeId));
	}

}
