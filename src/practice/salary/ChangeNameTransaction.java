package practice.salary;

public class ChangeNameTransaction extends ChangeEmployeeTransaction
{
	private String name;
	public ChangeNameTransaction(int empid,String name)
	{
		super(empid);
		this.name = name;
	}

	@Override
	protected void change(Employee e)
	{
		e.setName(name);
		
	}

}
