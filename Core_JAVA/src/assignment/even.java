package assignment;


//1) Write a Java program that uses a loop to generate up to 200 numbers. 
//If the number is even print "Green"
//If the number is odd print "Red"
//If it is any other number, don't print anything.
//You can use any of the loops and also think about using  'if-else' or 'switch-case'


public class even {
	
	public static void main(String args[])					//main calling , pg starts from here
	{
		System.out.println("\n ************** PROGRAM EXECUTION WAS STARTED:*************");
		
		for (int i=0;i<200;i++)								//for loop from 0 to 199 (like generating 200 numbers)
		{
			if(i%2==0)										// even number check
			{
				if(i==0)									// we consider zero as not even not odd so this is to reflect that
				{
					continue;
				}
				else										// in this loop all comes even
				{
					System.out.println("GREEN\t"+i);
				}
			
			}
			else											// odd numbers 
			{
				System.out.println("RED\t"+i);
				
			}
		}
		
	}

}
