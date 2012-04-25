package practice.salary;

public abstract class ChangeClassificationTransaction extends ChangeEmployeeTransaction
{
	public ChangeClassificationTransaction(int empid)
	{
		super(empid);
	}

	protected void change(Employee e)
	{
		e.setClassfication(getClassfication());
		e.setSchedule(getSchedule());
	}

	protected abstract PaymentSchedule getSchedule();

	protected abstract PaymentClassification getClassfication();
}
