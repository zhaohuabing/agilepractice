package practice.salary;

public class SalariedClassification implements PaymentClassification
{
	private double salary;

	public SalariedClassification(double salary)
	{
		super();
		this.salary = salary;
	}

	@Override
	public double calculatePay(PayCheck pc)
	{
		return salary;
	}

}
