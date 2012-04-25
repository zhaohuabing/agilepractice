package practice.salary;

public class ChangeAddrTransaction extends ChangeEmployeeTransaction
{
	private String addr;
	public ChangeAddrTransaction(int empid,String addr)
	{
		super(empid);
		this.addr = addr;
	}

	@Override
	protected void change(Employee e)
	{
		e.setAddr(addr);
		
	}

}
