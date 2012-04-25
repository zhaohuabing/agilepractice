package practice.salary;

import java.util.HashMap;

public class NoAffiliation implements Affiliation
{

	public NoAffiliation()
	{
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see practice.salary.Affiliation#getServiceCharge(java.lang.String)
	 */
	@Override
	public double getServiceCharge(String date)
	{
		return 0;
	}

	/* (non-Javadoc)
	 * @see practice.salary.Affiliation#addServiceCharge(java.lang.String, double)
	 */
	@Override
	public void addServiceCharge(String date, double charge)
	{
		
	}

	@Override
	public double calculateDeductions(PayCheck pc)
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
