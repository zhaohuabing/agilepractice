package practice.salary;

public  class ChangeHourlyClassificationTransaction extends
		ChangeClassificationTransaction
{
	private double hourRate;

	public ChangeHourlyClassificationTransaction(int empid, double hourRate)
	{
		super(empid);
		this.hourRate = hourRate;
	}

	protected PaymentSchedule getSchedule()
	{
		return new WeeklySchedule();		
	}

	protected PaymentClassification getClassfication()
	{
		return new HourlyClassification(hourRate);
	}
}
