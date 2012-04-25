package practice.salary;

import java.util.Date;

public class Employee
{
	private int id;
	private String name;
	private String addr;
	private PaymentClassification paymentClassification;
	private PaymentSchedule paymentSchedule;
	private Affiliation af = new NoAffiliation();

	public Employee(int id, String name, String addr)
	{
		this.id = id;
		this.name = name;
		this.addr = addr;
	}

	public String getName()
	{
		return name;
	}

	public int getId()
	{
		return id;
	}

	public PaymentClassification getPaymentClassification()
	{
		return paymentClassification;
	}

	public void setPaymentClassification(
			PaymentClassification paymentClassification)
	{
		this.paymentClassification = paymentClassification;

	}

	public void setSchedule(PaymentSchedule paymentSchedule)
	{
		this.paymentSchedule = paymentSchedule;

	}

	public PaymentSchedule getSchedule()
	{
		return this.paymentSchedule;
	}

	public void setAffiliation(Affiliation af)
	{
		this.af = af;

	}

	public Affiliation getAffiliation()
	{
		return af;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAddr(String addr)
	{
		this.addr = addr;
	}

	public void setClassfication(PaymentClassification classfication)
	{
		this.paymentClassification= classfication;
		
	}

	public boolean isPayDate(Date date)
	{
		return paymentSchedule.isPayDate(date);
	}

	public void payDay(PayCheck pc)
	{
		double grossPay=this.paymentClassification.calculatePay(pc);
		double deductions=this.getAffiliation().calculateDeductions(pc);
		double netPay = grossPay-deductions;
		pc.setGrossPay(grossPay);
		pc.setDeductions(deductions);
		pc.setNetPay(netPay);
	}
}
