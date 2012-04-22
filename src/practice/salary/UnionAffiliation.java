package practice.salary;

import java.util.HashMap;

public class UnionAffiliation
{
	private HashMap<String, Double> serviceCharge = new HashMap<String, Double>();

	public UnionAffiliation(int memberId, double d)
	{
		// TODO Auto-generated constructor stub
	}

	public double getServiceCharge(String date)
	{
		return serviceCharge.get(date);
	}

	public void addServiceCharge(String date, double charge)
	{
		serviceCharge.put(date, charge);

	}

}
