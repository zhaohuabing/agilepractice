package practice.salary;

import java.util.Date;

public class PayCheck
{
	private double grossPay;
	

	private double deductions;
	
	private double netPay;

	private Date payDate;
	
	public PayCheck(Date payDate)
	{
		this.payDate = payDate;
	}
	
	public double getGrossPay()
	{
		return grossPay;
	}

	public void setGrossPay(double grossPay)
	{
		this.grossPay = grossPay;
	}

	public double getDeductions()
	{
		return deductions;
	}

	public void setDeductions(double deductions)
	{
		this.deductions = deductions;
	}

	public double getNetPay()
	{
		return netPay;
	}

	public void setNetPay(double netPay)
	{
		this.netPay = netPay;
	}



}
