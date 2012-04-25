package practice.salary;

public interface Affiliation
{

	public abstract double getServiceCharge(String date);

	public abstract void addServiceCharge(String date, double charge);

	public abstract double calculateDeductions(PayCheck pc);

}