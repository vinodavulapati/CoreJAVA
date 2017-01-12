package assignment4;

public class BinarySearch
{

	public int binarySearch(int[] array,int value,int start,int end)
	{
	if((end-start)<=1)
	{
		if(array[start]==value)
			return start;
		if(array[end]==value)
			return end;
		return -1;
	}
	int midPoint = (start + end) / 2;
	if(array[midPoint]>value)
	{
		return binarySearch(array,value,0,midPoint);
	
	}
	else
	{
		return binarySearch(array,value,midPoint,end);
		
	}
}
}
