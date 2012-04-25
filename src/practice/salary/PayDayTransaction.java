package practice.salary;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PayDayTransaction implements Transaction
{
	private Date payDate;
	private Map<Integer,PayCheck> payChecks = new HashMap<Integer,PayCheck>();
	public PayDayTransaction(Date payDate)
	{
		super();
		this.payDate = payDate;
	}
	
	@Override
	public void execute()
	{
		int[] ids = PayrollDatabase.getInstance().getAllEmployeeIds();
		for (int i = 0; i < ids.length; i++)
		{
			Employee e = PayrollDatabase.getInstance().getEmployee(ids[i]);
			if(e.isPayDate(payDate))
			{
				PayCheck pc = new PayCheck(payDate);
				e.payDay(pc);
				payChecks.put(ids[i], pc);
			}
		}

	}

	public PayCheck getPayCheck(int id)
	{
		return payChecks.get(Integer.valueOf(id));
	}

}
