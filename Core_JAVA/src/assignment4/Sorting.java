package assignment4;

//import java.util.*;

public class Sorting extends Thread
{
	public void run()
	{
	
	}
	public int[] sortMethod()
	{
		int array1[]={64,32,98,12,2,78,11,35,47,8,6,13};
		int temp;
		System.out.println("sorted Array was;");
		for(int i=0;i<array1.length;i++)
		{
			for(int j=i+1;j<array1.length;j++)
			{
				 if (array1[i] > array1[j]) 
	                {
	                    temp = array1[i];
	                    array1[i] = array1[j];
	                    array1[j] = temp;
	                }
			}
			
		}
	for(int i=0;i<array1.length;i++)
	{
		System.out.println(array1[i]);
	}
		return array1;
	
	}
	
	
	
	
}



	
	
	
	

