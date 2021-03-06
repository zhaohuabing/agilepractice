package practice.salary;

import java.util.HashMap;

public class UnionAffiliation implements Affiliation
{
	private HashMap<String, Double> serviceCharge = new HashMap<String, Double>();

	public UnionAffiliation(int memberId, double d)
	{
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see practice.salary.Affiliation#getServiceCharge(java.lang.String)
	 */
	@Override
	public double getServiceCharge(String date)
	{
		return serviceCharge.get(date);
	}

	/* (non-Javadoc)
	 * @see practice.salary.Affiliation#addServiceCharge(java.lang.String, double)
	 */
	@Override
	public void addServiceCharge(String date, double charge)
	{
		serviceCharge.put(date, charge);

	}

	@Override
	public double calculateDeductions(PayCheck pc)
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
