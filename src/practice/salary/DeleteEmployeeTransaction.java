package practice.salary;

public class DeleteEmployeeTransaction
{
    private int id;
    
    public DeleteEmployeeTransaction(int id)
    {
	this.id = id;
	
    }

    public void execute()
    {
	PayrollDatabase.getInstance().deleteEmployee(id);
    }


}
