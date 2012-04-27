package practice.salary;

import java.util.Date;

public class PayCheck
{
	private double grossPay;
	

	private double deductions;
	
	private double netPay;

	private Date payPeriodStartDate;
	
	private Date payDate;
	
	public Date getPayDate()
	{
		return payDate;
	}

	public PayCheck(Date payPeriodStartDate, Date payDate)
	{
		this.payPeriodStartDate = payPeriodStartDate;
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

	public Date getPayPeriodStartDate()
	{
		return payPeriodStartDate;
	}

}
