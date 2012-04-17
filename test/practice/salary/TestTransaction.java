package practice.salary;

import junit.framework.TestCase;

public class TestTransaction extends TestCase
{
    public void testAddSalariedEmployee()
    {
	int id =1;
	AddSalariedEmployeeTransaction t = new AddSalariedEmployeeTransaction(1,"Bob","Home",1000.00);
	t.execute();
	Employee e = PayrollDatabase.getInstance().getEmployee(id);
	assertEquals(e.getName(),"Bob");
	assertTrue(e.getPaymentClassification() instanceof SalariedClassification);
	assertTrue(e.getSchedule() instanceof MonthlySchedule);
    }
    
    public void testAddHourlyEmployee()
    {
	int id =1;
	AddHourlyEmployeeTransaction t = new AddHourlyEmployeeTransaction(1,"Jack","Home",10);
	t.execute();
	Employee e = PayrollDatabase.getInstance().getEmployee(id);
	assertEquals(e.getName(),"Jack");
	assertTrue(e.getPaymentClassification() instanceof HourlyClassification);
	assertTrue(e.getSchedule() instanceof WeeklySchedule);
    }
    
    public void testAddCommionedEmployee()
    {
	int id =1;
	AddCommisionedEmployeeTransaction t = new AddCommisionedEmployeeTransaction(1,"Alice","Home",20);
	t.execute();
	Employee e = PayrollDatabase.getInstance().getEmployee(id);
	assertEquals(e.getName(),"Alice");
	assertTrue(e.getPaymentClassification() instanceof CommionedClassification);
	assertTrue(e.getSchedule() instanceof BiWeeklySchedule);
    }
    
    public void testDeleteEmployee()
    {
	int id =1;
	new AddCommisionedEmployeeTransaction(1,"Alice","Home",20).execute();
	DeleteEmployeeTransaction t = new DeleteEmployeeTransaction(1);
	t.execute();
	Employee e = PayrollDatabase.getInstance().getEmployee(id);
	
	assertTrue(e==null);
    }
    
    public void testAddTimeCard()
    {
	int id =1;
	AddHourlyEmployeeTransaction t = new AddHourlyEmployeeTransaction(1,"Jack","Home",10);
	t.execute();
	TimeCardTransaction tct = new TimeCardTransaction("20120211",8,id);
	tct.execute();
	
	Employee e = PayrollDatabase.getInstance().getEmployee(id);
	HourlyClassification pc = (HourlyClassification) e.getPaymentClassification();
	TimeCard tc = pc.getTimeCard("20120211");
	assertTrue(tc != null);
	assertEquals(tc.getHour(),8);
	    }
    public void testAddSalesRecepit()
    {
	int id =1;
	AddCommisionedEmployeeTransaction t = new AddCommisionedEmployeeTransaction(1,"Alice","Home",20);
	t.execute();
	
	SalesReceiptTransaction tct = new SalesReceiptTransaction("20120211",20,id);
	tct.execute();
	

	Employee e = PayrollDatabase.getInstance().getEmployee(id);
	CommionedClassification pc = (CommionedClassification) e.getPaymentClassification();
	SalesReceipt sr = pc.getSalesReceipt("20120211");
	assertTrue(sr != null);
	assertEquals(sr.getAmount(),20);
	    }
}
