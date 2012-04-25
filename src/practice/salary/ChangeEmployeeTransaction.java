package practice.salary;

public abstract class ChangeEmployeeTransaction implements Transaction
{
	private int empid;

	public ChangeEmployeeTransaction(int empid)
	{
		super();
		this.empid = empid;
	}

	protected abstract void change(Employee e);

	@Override
	public void execute()
	{
		Employee e = PayrollDatabase.getInstance().getEmployee(empid);
		change(e);
	}

}
