package practice.salary;

import java.util.Date;

public class BiWeeklySchedule implements PaymentSchedule
{

	@Override
	public boolean isPayDate(Date date)
	{
		return false;
	}

}
