package practice.salary;

public class AddCommisionedEmployeeTransaction extends AddEmployeeTransaction
{

	private double rate;

	public AddCommisionedEmployeeTransaction(int i, String name, String addr,
			double rate)
	{
		super(i, name, addr);
		this.rate = rate;
	}

	@Override
	protected PaymentSchedule getPaymentSchedule()
	{
		return new BiWeeklySchedule();
	}

	@Override
	protected PaymentClassification getPaymentClassification()
	{
		return new CommionedClassification(rate);
	}

}