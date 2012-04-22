package practice.salary;

public class TimeCardTransaction implements Transaction
{
	private String date;
	private int hour;
	private int employeeId;

	public TimeCardTransaction(String date, int hour, int employeeId)
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
