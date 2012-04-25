package practice.salary;

public class AddCommisionedEmployeeTransaction extends AddEmployeeTransaction
{

	private double rate;
	private double salary;

	public AddCommisionedEmployeeTransaction(int i, String name, String addr,
			double rate,double salary)
	{
		super(i, name, addr);
		this.rate = rate;
		this.salary = salary;
	}

	@Override
	protected PaymentSchedule getPaymentSchedule()
	{
		return new BiWeeklySchedule();
	}

	@Override
	protected PaymentClassification getPaymentClassification()
	{
		return new CommionedClassification(rate,salary);
	}

}