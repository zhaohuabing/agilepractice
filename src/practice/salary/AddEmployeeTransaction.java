package practice.salary;

public abstract class AddEmployeeTransaction implements Transaction
{
    private int id;
    private String name;
    private String addr;
    public AddEmployeeTransaction(int id, String name, String addr)
    {
	this.id = id;
	this.name = name;
	this.addr =addr;
    }

    public void execute()
    {
	Employee e = new Employee(id, name, addr);
	e.setPaymentClassification(getPaymentClassification());
	e.setSchedule(getPaymentSchedule());
	PayrollDatabase.getInstance().addEmployee(e);
    }

    protected abstract PaymentSchedule getPaymentSchedule();

    protected abstract PaymentClassification getPaymentClassification();
}
