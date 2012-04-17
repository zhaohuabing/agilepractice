package practice.salary;

public class AddSalariedEmployeeTransaction extends AddEmployeeTransaction
{
    private double salary ;
    public AddSalariedEmployeeTransaction(int i, String name, String addr,
	    double salary)
    {
	super(i,name,addr);
	this.salary = salary;
    }

    @Override
    protected PaymentSchedule getPaymentSchedule()
    {
	return new MonthlySchedule();
    }

    @Override
    protected PaymentClassification getPaymentClassification()
    {
	return new SalariedClassification(salary);
    }   
    

}
