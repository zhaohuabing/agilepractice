package practice.salary;

import java.util.Date;

public class TimeCardTransaction implements Transaction
{
	private Date date;
	private int hour;
	private int employeeId;

	public TimeCardTransaction(Date date, int hour, int employeeId)
	{
		this.date = date;
		this.hour = hour;
		this.employeeId = employeeId;
	}

	public void execute()
	{
		Employee e = PayrollDatabase.getInstance().getEmployee(employeeId);
		HourlyClassification cf = (HourlyClassification) e
				.getPaymentClassification();
		cf.addTimeCard(new TimeCard(date, hour, employeeId));
	}

}
