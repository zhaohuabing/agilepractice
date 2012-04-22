package practice.salary;

public class AddHourlyEmployeeTransaction extends AddEmployeeTransaction
{

	private double rate;

	public AddHourlyEmployeeTransaction(int i, String name, String addr,
			double rate)
	{
		super(i, name, addr);
		this.rate = rate;
	}

	@Override
	protected PaymentSchedule getPaymentSchedule()
	{
		return new WeeklySchedule();
	}

	@Override
	protected PaymentClassification getPaymentClassification()
	{
		return new HourlyClassification(rate);
	}

}