package practice.salary;

public class SalesReceiptTransaction implements Transaction
{
   private String date;
   private int amount;
   private int employeeId;
    public SalesReceiptTransaction(String date, int amount,int employeeId)
    {
	this.date =date;
	this.amount =amount;
	this.employeeId =employeeId;
    }
   
    public void execute()
    {
	Employee e= PayrollDatabase.getInstance().getEmployee(employeeId);
	CommionedClassification cf = (CommionedClassification)e.getPaymentClassification();
	cf.addSalesReceipt(new SalesReceipt(date,amount,employeeId));
    }

}
