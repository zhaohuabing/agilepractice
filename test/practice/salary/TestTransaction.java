package practice.salary;

import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;

public class TestTransaction extends TestCase
{
	public void testAddSalariedEmployee()
	{
		int id = 1;
		AddSalariedEmployeeTransaction t = new AddSalariedEmployeeTransaction(
				1, "Bob", "Home", 1000.00);
		t.execute();
		Employee e = PayrollDatabase.getInstance().getEmployee(id);
		assertEquals(e.getName(), "Bob");
		assertTrue(e.getPaymentClassification() instanceof SalariedClassification);
		assertTrue(e.getSchedule() instanceof MonthlySchedule);
	}

	public void testAddHourlyEmployee()
	{
		int id = 1;
		AddHourlyEmployeeTransaction t = new AddHourlyEmployeeTransaction(1,
				"Jack", "Home", 10);
		t.execute();
		Employee e = PayrollDatabase.getInstance().getEmployee(id);
		assertEquals(e.getName(), "Jack");
		assertTrue(e.getPaymentClassification() instanceof HourlyClassification);
		assertTrue(e.getSchedule() instanceof WeeklySchedule);
	}

	public void testAddCommionedEmployee()
	{
		int id = 1;
		AddCommisionedEmployeeTransaction t = new AddCommisionedEmployeeTransaction(
				1, "Alice", "Home", 20, 1000);
		t.execute();
		Employee e = PayrollDatabase.getInstance().getEmployee(id);
		assertEquals(e.getName(), "Alice");
		assertTrue(e.getPaymentClassification() instanceof CommionedClassification);
		assertTrue(e.getSchedule() instanceof BiWeeklySchedule);
	}

	public void testDeleteEmployee()
	{
		int id = 1;
		new AddCommisionedEmployeeTransaction(1, "Alice", "Home", 20, 1000)
				.execute();
		DeleteEmployeeTransaction t = new DeleteEmployeeTransaction(1);
		t.execute();
		Employee e = PayrollDatabase.getInstance().getEmployee(id);

		assertTrue(e == null);
	}

	public void testAddTimeCard()
	{
		int id = 1;
		AddHourlyEmployeeTransaction t = new AddHourlyEmployeeTransaction(1,
				"Jack", "Home", 10);
		t.execute();
		TimeCardTransaction tct = new TimeCardTransaction(
				new GregorianCalendar(2012, 2, 11).getTime(), 8, id);
		tct.execute();

		Employee e = PayrollDatabase.getInstance().getEmployee(id);
		HourlyClassification pc = (HourlyClassification) e
				.getPaymentClassification();
		TimeCard tc = pc.getTimeCard(new GregorianCalendar(2012, 2, 11)
				.getTime());
		assertTrue(tc != null);
		assertEquals(tc.getHour(), 8);
	}

	public void testAddSalesRecepit()
	{
		int id = 1;
		AddCommisionedEmployeeTransaction t = new AddCommisionedEmployeeTransaction(
				1, "Alice", "Home", 20, 1000);
		t.execute();

		SalesReceiptTransaction tct = new SalesReceiptTransaction(
				new GregorianCalendar(2012, 2, 11).getTime(), 20, id);
		tct.execute();

		Employee e = PayrollDatabase.getInstance().getEmployee(id);
		CommionedClassification pc = (CommionedClassification) e
				.getPaymentClassification();
		SalesReceipt sr = pc.getSalesReceipt(new GregorianCalendar(2012, 2, 11)
				.getTime());
		assertTrue(sr != null);
		assertEquals(sr.getAmount(), 20);
	}

	public void testAddServiceCharge()
	{
		int id = 1;
		AddHourlyEmployeeTransaction t = new AddHourlyEmployeeTransaction(1,
				"Jack", "Home", 10);
		t.execute();

		Employee e = PayrollDatabase.getInstance().getEmployee(id);
		int memberId = 86;
		Affiliation af = new UnionAffiliation(memberId, 12.5);
		e.setAffiliation(af);
		PayrollDatabase.getInstance().AddUnionMember(memberId, e);
		ServiceChargeTransaction sct = new ServiceChargeTransaction(memberId,
				"20011101", 12.95);
		sct.execute();
		double sc = af.getServiceCharge("20011101");
		assertEquals(12.95, sc);

	}

	public void testChangeClassificationTransaction()
	{
		int id = 1;
		AddCommisionedEmployeeTransaction t = new AddCommisionedEmployeeTransaction(
				id, "Alice", "Home", 20, 1000);
		t.execute();
		ChangeHourlyClassificationTransaction cht = new ChangeHourlyClassificationTransaction(
				id, 100);
		cht.execute();
		Employee e = PayrollDatabase.getInstance().getEmployee(id);
		assertTrue(e.getPaymentClassification() instanceof HourlyClassification);
	}

	public void testPaySingleSalariedEmployee()
	{
		int id = 1;
		AddSalariedEmployeeTransaction t = new AddSalariedEmployeeTransaction(
				1, "Bob", "Home", 1000.00);
		t.execute();

		Date payDate = new GregorianCalendar(2012, 5, 30).getTime();
		PayDayTransaction pt = new PayDayTransaction(payDate);
		pt.execute();

		PayCheck pc = pt.getPayCheck(id);
		assertEquals(pc.getGrossPay(), 1000.0);
		assertEquals(pc.getDeductions(), 0.0);
		assertEquals(pc.getNetPay(), 1000.0);

		payDate = new GregorianCalendar(2012, 5, 29).getTime();
		pt = new PayDayTransaction(payDate);
		pt.execute();

		pc = pt.getPayCheck(id);
		assertEquals(pc, null);
	}

	public void testPayHourlyEmployee()
	{
		int id = 1;
		AddHourlyEmployeeTransaction t = new AddHourlyEmployeeTransaction(1,
				"Jack", "Home", 10);
		t.execute();

		TimeCardTransaction tct = new TimeCardTransaction(
				new GregorianCalendar(2012, 2, 2).getTime(), 8, id);
		tct.execute();

		tct = new TimeCardTransaction(
				new GregorianCalendar(2012, 2, 10).getTime(), 6, id);
		tct.execute();

		Date payDate = new GregorianCalendar(2012, 2, 3).getTime();
		PayDayTransaction pt = new PayDayTransaction(payDate);
		pt.execute();

		PayCheck pc = pt.getPayCheck(id);
		assertEquals(pc.getGrossPay(), 80.0);
		assertEquals(pc.getDeductions(), 0.0);
		assertEquals(pc.getNetPay(), 80.0);

		payDate = new GregorianCalendar(2012, 2, 10).getTime();
		pt = new PayDayTransaction(payDate);
		pt.execute();

		pc = pt.getPayCheck(id);
		assertEquals(pc.getGrossPay(), 60.0);
		assertEquals(pc.getDeductions(), 0.0);
		assertEquals(pc.getNetPay(), 60.0);

		payDate = new GregorianCalendar(2012, 2, 9).getTime();
		pt = new PayDayTransaction(payDate);
		pt.execute();
		pc = pt.getPayCheck(id);

		assertEquals(pc, null);
	}
}
