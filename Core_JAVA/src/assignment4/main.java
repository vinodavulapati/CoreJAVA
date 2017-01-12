package assignment4;
import java.util.*;

public class main {
	public static void main(String args[])
	{
		int array2[];
		Sorting s1=new Sorting();
		
		//s1.sortMethod();
		
		array2=s1.sortMethod();
		Scanner s = new Scanner(System.in);
		System.out.println("enter an integer to search its location");
		int x = s.nextInt();
		
		//s1.binarySearch(s1.sortMethod(),x,0,s1.sortMethod().length-1); //sorting method pritning sorted aaray thrice so keeping result in new array in main method
		
		BinarySearch b1= new BinarySearch();
	int res=b1.binarySearch(array2,x,0,array2.length-1);
		System.out.println("the result is +"+res);
	//System.out.println(	b1.binarySearch(array2,x,0,array2.length-1));
		s.close();
		
	}

}
