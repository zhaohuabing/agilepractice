package practice.salary;

public class Employee
{
	private int id;
	private String name;
	private String addr;
	private PaymentClassification paymentClassification;
	private PaymentSchedule paymentSchedule;
	private UnionAffiliation af;

	public Employee(int id, String name, String addr)
	{
		this.id = id;
		this.name = name;
		this.addr = addr;
	}

	public String getName()
	{
		return name;
	}

	public int getId()
	{
		return id;
	}

	public PaymentClassification getPaymentClassification()
	{
		return paymentClassification;
	}

	public void setPaymentClassification(
			PaymentClassification paymentClassification)
	{
		this.paymentClassification = paymentClassification;

	}

	public void setSchedule(PaymentSchedule paymentSchedule)
	{
		this.paymentSchedule = paymentSchedule;

	}

	public PaymentSchedule getSchedule()
	{
		return this.paymentSchedule;
	}

	public void setAffiliation(UnionAffiliation af)
	{
		this.af = af;

	}

	public UnionAffiliation getAffiliation()
	{
		return af;
	}
}
