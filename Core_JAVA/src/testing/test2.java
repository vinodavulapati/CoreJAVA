package testing;

public class test2 {
	
	
		  public static void main(String args[]){  
			 
			  
			  try{  
		   int data=25/0;  
		   System.out.println(data);  
		  } 
			  finally{System.out.println("finally block is always executed");} 
		 // catch(NullPointerException e){System.out.println(e);}  
		//  finally{System.out.println("finally block is always executed");}  
		  System.out.println("rest of the code...");  
		  }  
		}
	

