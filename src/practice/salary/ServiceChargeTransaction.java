package practice.salary;

public class ServiceChargeTransaction implements Transaction
{
	private int memberId;
	private String date;
	private double charge;

	public ServiceChargeTransaction(int memberId, String date, double charge)
	{
		this.memberId = memberId;
		this.date = date;
		this.charge = charge;
	}

	public void execute()
	{
		Employee e = PayrollDatabase.getInstance().getUnionMember(memberId);
		UnionAffiliation af = e.getAffiliation();
		af.addServiceCharge(date, charge);

	}

}
