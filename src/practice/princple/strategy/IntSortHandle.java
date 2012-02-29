package practice.princple.strategy;

public class IntSortHandle implements SortHandle
{
    private int[] array;
    public IntSortHandle(int[] array)
    {
	super();
	this.array = array;
    }
    

    public void swap(int i, int j)
    {
	int temp =array[i];
	array[i]=array[j];
	array[j]=temp;
    }

    @Override
    public boolean outOfOrder(int i, int j)
    {
	return array[j]>array[i];
    }

    @Override
    public int length()
    {
	return array.length;
    }

}
