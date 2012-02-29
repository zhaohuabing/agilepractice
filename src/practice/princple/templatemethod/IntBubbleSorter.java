package practice.princple.templatemethod;

public class IntBubbleSorter extends BubbleSorter
{
    private int[] array;
    public IntBubbleSorter(int[] array)
    {
	super();
	this.array = array;
	this.length=array.length;
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

}
